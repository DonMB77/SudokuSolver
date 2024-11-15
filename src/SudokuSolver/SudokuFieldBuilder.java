package SudokuSolver;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class SudokuFieldBuilder extends Frame {

    // Fields:
    private int[][] testSudokuFieldMulti1 = {
            {9, 6, 0, 7, 5, 0, 2, 0, 0},
            {0, 3, 0, 0, 0, 2, 0, 0, 0},
            {0, 2, 8, 0, 0, 3, 6, 0, 7},
            {0, 5, 9, 8, 0, 0, 0, 0, 0},
            {1, 0, 6, 2, 0, 4, 9, 0, 5},
            {0, 0, 3, 0, 6, 0, 7, 0, 4},
            {3, 1, 7, 0, 0, 5, 4, 0, 6},
            {6, 0, 5, 0, 0, 0, 1, 3, 8},
            {0, 4, 0, 3, 1, 6, 0, 0, 0}
    };
    private final JFrame jframe = new JFrame("Sudoku Solver");
    private JPanel panel = new JPanel();
    private final int row = 9;
    private final int col = 9;
    private JLabel[][] grid = new JLabel[row][col];

    // Constructors:
    public SudokuFieldBuilder() {

    }

    // Methods:
    public void buildFrame () {
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jframe.setSize(600, 600);

        jframe.setVisible(true);

        jframe.add(this.panel);

        panel.setLayout(new GridLayout(this.row, this.col));

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                grid[i][j] = new JLabel();
                if (testSudokuFieldMulti1[i][j] == 0) {
                    grid[i][j].setText("");
                } else {
                    grid[i][j].setText(String.valueOf(testSudokuFieldMulti1[i][j]));
                }
                grid[i][j].setBorder(new LineBorder(Color.BLACK));
                grid[i][j].setOpaque(true);
                Border border = grid[i][j].getBorder();
                Border margin = new EmptyBorder(10,25,10,0);
                grid[i][j].setBorder(new CompoundBorder(border, margin));
                panel.add(grid[i][j]);
            }
        }
    }
}
