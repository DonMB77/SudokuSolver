import javax.swing.*;

public class Main {

    public static void main (String[] args) {
        JFrame jframe = new JFrame("Sudoku Solver");

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jframe.setSize(600,600);

        jframe.setVisible(true);

        int[] testSudokuField = {
                1 ,3 ,6 ,9 ,5 ,7 ,4 ,2 ,8,
                1 ,3 ,6 ,9 ,5 ,7 ,4 ,2 ,8,
                1 ,3 ,6 ,9 ,5 ,7 ,4 ,2 ,8,
                1 ,3 ,6 ,9 ,5 ,7 ,4 ,2 ,8,
                1 ,3 ,6 ,9 ,5 ,7 ,4 ,2 ,8,
                1 ,3 ,6 ,9 ,5 ,7 ,4 ,2 ,8,
                1 ,3 ,6 ,9 ,5 ,7 ,4 ,2 ,8,
                1 ,3 ,6 ,9 ,5 ,7 ,4 ,2 ,8,
                1 ,3 ,6 ,9 ,5 ,7 ,4 ,2 ,8
        };

        for (int number : testSudokuField) {
            
        }

        JLabel label = new JLabel();
        label.setText(String.valueOf(testSudokuField[0]));

        jframe.add(label);
    }
}