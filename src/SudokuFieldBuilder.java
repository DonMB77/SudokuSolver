import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class SudokuFieldBuilder extends Frame {

    // Fields:
    private String[] testSudokuFieldSingle = {
            "1", "3", "6", "9", "5", "7", "4", "2", "8",
            "1", "3", "6", "9", "5", "7", "4", "2", "8",
            "1", "3", "6", "9", "5", "7", "4", "2", "8",
            "1", "3", "6", "9", "5", "7", "4", "2", "8",
            "1", "3", "6", "9", "5", "7", "4", "2", "8",
            "1", "3", "6", "9", "5", "7", "4", "2", "8",
            "1", "3", "6", "9", "5", "7", "4", "2", "8",
            "1", "3", "6", "9", "5", "7", "4", "2", "8",
            "1", "3", "6", "9", "5", "7", "4", "2", "8"
    };
    private String[][] testSudokuFieldMulti = {
            {"1", "3", "6", "9", "5", "7", "4", "2", "8"},
            {"1", "3", "6", "9", "5", "7", "4", "2", "8"},
            {"1", "3", "6", "9", "5", "7", "4", "2", "8"},
            {"1", "3", "6", "9", "5", "7", "4", "2", "8"},
            {"1", "3", "6", "9", "5", "7", "4", "2", "8"},
            {"1", "3", "6", "9", "5", "7", "4", "2", "8"},
            {"1", "3", "6", "9", "5", "7", "4", "2", "8"},
            {"1", "3", "6", "9", "5", "7", "4", "2", "8"},
            {"1", "3", "6", "9", "5", "7", "4", "2", "8"}
    };
    private JFrame jframe = new JFrame("Sudoku Solver");
    private JPanel panel = new JPanel();
    private int row = 9;
    private int col = 9;
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
                grid[i][j].setBorder(new LineBorder(Color.BLACK));
                grid[i][j].setOpaque(true);
                panel.add(grid[i][j]);
            }
        }
    }
}
