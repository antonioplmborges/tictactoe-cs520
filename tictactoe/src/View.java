import javax.swing.*;
import java.awt.*;

public class View {

    private final int BOARD_SIZE = 3;
    private JFrame gui ;
    private JButton[][] blocks;
    private JButton reset;
    private JTextArea playerturn;
    private JPanel game;
    private JPanel gamePanel;
    private JPanel options;
    private JPanel messages;

    public View(){

        initializer();
        playerturn.setText("Player 1 to play 'X'");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(new Dimension(500+(BOARD_SIZE-3)*100, 350+(BOARD_SIZE-3)*100));
        gui.setResizable(true);

        gamePanel.add(game, BorderLayout.CENTER);

        options.add(reset);

        messages.setBackground(Color.white);
        messages.add(playerturn);

        gui.add(gamePanel, BorderLayout.NORTH);
        gui.add(options, BorderLayout.CENTER);
        gui.add(messages, BorderLayout.SOUTH);

        initializeBlocks();
    }



    public void initializeBlocks(){
        for(int row = 0; row<BOARD_SIZE ;row++) {
            for (int column = 0; column < BOARD_SIZE; column++) {
                blocks[row][column] = new JButton();
                blocks[row][column].putClientProperty("row",row);
                blocks[row][column].putClientProperty("column",column);
                blocks[row][column].setPreferredSize(new Dimension(75, 75));
                blocks[row][column].setText("");
                game.add(blocks[row][column]);
            }
        }
    }

    //public void setText(){
    //    this.playerturn.setText("Player 1 to play 'X'");
    //}



    public JTextArea getPlayerturn(){
        return playerturn;
    }

    public JButton getReset() {
        return reset;
    }

    public JButton[][] getBlocks() {
        return blocks;
    }

    public JFrame getGui() {
        return gui;
    }

    public void setMessages(JTextArea playerturn) {
        messages.add(playerturn);
    }

    public int getBOARD_SIZE() {
        return BOARD_SIZE;
    }

    public void initializer(){
        gui = new JFrame("Tic Tac Toe");
        blocks = new JButton[BOARD_SIZE][BOARD_SIZE];
        reset = new JButton("Reset");
        playerturn = new JTextArea();
        game = new JPanel(new GridLayout(BOARD_SIZE,BOARD_SIZE));
        gamePanel = new JPanel(new FlowLayout());
        options = new JPanel(new FlowLayout());
        messages = new JPanel(new FlowLayout());
    }
}
