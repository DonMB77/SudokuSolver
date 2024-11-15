package SudokuSolver;

public class SudokuSolver {

    // size of the matrix:
    static int matrixSize = 9;

    /* main method to solve the problem. Attempts to assign values to all unassigned fields in accordance to meet the requirements
     for Sudoku (no duplication across rows, columns, and boxes).
     */
    static boolean solveSudoku(int grid[][], int row, int col) {
        // if we reached the 8th row and 9th column we are returning true to not backtrack
        if (row == matrixSize - 1 && col == matrixSize) {
            return true;
        }

        // if we reached column value 9 we move to the next row and column thus starts from 0 again. This will be used as our way of looping through the grid.
        if (col == matrixSize) {
            row++;
            col = 0;
        }

        // if the current position in the grid contains any number aside from 0, we iterate over it.
        if (grid[row][col] != 0) {
            return solveSudoku(grid, row, col + 1);
        }

        // now for inputting the numbers
        for (int num = 1; num < 10; num ++) {
             // check if it is legal to place the number
            if (isSafe(grid, row, col, num)) {
                // assign the number in the current field
                grid[row][col] = num;

                // moving on for the next possibility in the next column
                if (solveSudoku(grid, row, col + 1)) {
                    return true;
                }
            }
            // removing the assigned number since our assumption was wrong.
            grid[row][col] = 0;
        }
        return false;
    }

    // check if the currently planned to implement number is legal in this case
    static boolean isSafe (int[][] grid, int row, int col, int inputNumber) {

        // check if the same number exists in the same row
        for (int x = 0; x <= 8; x ++) {
            if (grid[row][x] == inputNumber) {
                return false;
            }
        }

        // check if the same number exists in the same column
        for (int x = 0; x <= 8; x ++) {
            if (grid[x][col] == inputNumber) {
                return false;
            }
        }

        // check if the same number exists in the same box
        int startRowOfBox = row - row % 3;
        int startColOfBox = col - col % 3;

        for (int x = 0; x < 3; x++) {
            for (int j = 0; j < 3; j++) {
                if (grid[x + startRowOfBox][j + startColOfBox] == inputNumber) {
                    return false;
                }
            }
        }

        return true;
    }
}
