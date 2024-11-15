import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class SudokuFieldBuilder extends Frame {

    // Fields:
    private String[][] testSudokuFieldMulti1 = {
            {"9", "6", null, "7", "5", null, "2", null, null},
            {null, "3", null, null, null, "2", null, null, null},
            {null, "2", "8", null, null, "3", "6", null, "7"},
            {null, "5", "9", "8", null, null, null, null, null},
            {"1", null, "6", "2", null, "4", "9", null, "5"},
            {null, null, "3", null, "6", null, "7", null, "4"},
            {"3", "1", "7", null, null, "5", "4", null, "6"},
            {"6", null, "5", null, null, null, "1", "3", "8"},
            {null, "4", null, "3", "1", "6", null, null, null}
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
                if (testSudokuFieldMulti1[i][j] == null) {
                    grid[i][j].setText("");
                } else {
                    grid[i][j].setText(testSudokuFieldMulti1[i][j]);
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
