import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private int row;
    private int column;
    private int player;

    public Controller(Model model, View view){
        buttonListener(model,view);
        resetListener(model,view);

    }

    public void buttonListener(Model model, View view)
    {
        for(int r = 0; r< view.getBOARD_SIZE() ;r++) {
            for (int c = 0; c < view.getBOARD_SIZE(); c++) {
                view.getBlocks()[r][c].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //int movesLeft;
                        //movesLeft = model.getMovesLeft();
                        //--movesLeft;
                        //model.setMovesLeft(movesLeft);
                        //model.setMessage(movesLeft);

                        JButton currButton =  (JButton)e.getSource();

                        row = Integer.parseInt(currButton.getClientProperty("row").toString());
                        column = Integer.parseInt(currButton.getClientProperty("column").toString());
                        player = model.getPlayer();
                        model.TicTacToe(row,column,player);

                    }
                });
            }
        }
    }

    public void resetListener(Model model, View view){
        view.getReset().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                model.resetGame();
            }
        });
    }


}
