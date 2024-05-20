import javax.swing.*;


public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 600;
        int boardHeight = boardWidth;

        JFrame frame = new JFrame("Snake"); //nome do programa
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false); // se pode por em tela cheia ou nn
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SnakeGame snakegame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakegame);
        frame.pack();
        snakegame.requestFocus();
    }
}
