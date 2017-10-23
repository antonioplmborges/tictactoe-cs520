import javax.sound.midi.Soundbank;
import java.awt.event.ActionEvent;

public class Model {

    private View view;
    private int player;
    private int movesLeft;
    private int board_size;

    public Model(View v){
        view = v;
        player = 1;
        board_size = v.getBOARD_SIZE(); 
        movesLeft = board_size*board_size;

    }


    public void TicTacToe(int row, int column, int player){
        --movesLeft;
        //System.out.println(movesLeft);
        setMessage(movesLeft); 
        play(row,column,player);
        if(movesLeft<board_size*board_size-board_size) {
            checkForWin(row, column,player);
        }else if(movesLeft == 0)
            view.getPlayerturn().setText("Game ends in a draw");

        nextPlayer(player);

    }

    /**
     * Reset the game and game board.
     */
    public void resetGame() {
        for(int row = 0;row<board_size;row++) {
            for(int column = 0;column<board_size;column++) {
                view.getBlocks()[row][column].setText("");
                view.getBlocks()[row][column].setEnabled(true);
            }
        }

        player = 1;
        movesLeft = board_size*board_size;
        view.getPlayerturn().setText("Player 1 to play 'X'");
    }


    public int getMovesLeft() {
        return movesLeft;
    }

    //public void setMovesLeft(int movesLeft) {this.movesLeft = movesLeft;}

    public void setMessage(int movesLeft){

        if (movesLeft % 2 == 1) {
            view.setMessages( view.getPlayerturn());
            view.getPlayerturn().setText("'X': Player 1");

        } else {
            view.setMessages( view.getPlayerturn());
            view.getPlayerturn().setText("'O': Player 2");

        }
    }

    public int getPlayer() {
        return player;
    }

    public boolean checkRow(int row){
        for (int i=0; i<board_size-1; i++){
            if(!view.getBlocks()[row][i].getText().equals(view.getBlocks()[row][i+1].getText()))
                return false;
        }
        //System.out.println("row");
        return true;
    }

    public boolean checkColumn(int column){
        for (int i=0;i<board_size-1;i++){
            if(!view.getBlocks()[i][column].getText().equals( view.getBlocks()[i+1][column].getText()))
                return false;
        }
        return true;
    }

    public boolean checkDiagonal(){
        for (int i=0; i<board_size-1; i++){
            if(!view.getBlocks()[i][i].getText().equals( view.getBlocks()[i+1][i+1].getText()))
                return false;
        }

        return true;
    }

    public boolean checkAntiDiagonal(){
        int col = board_size-1;
        for(int i=0; i<board_size-1; i++){

            if(!view.getBlocks()[i][col].getText().equals(view.getBlocks()[i+1][board_size-1-i-1].getText())) {
                return false;
            }
            col--;
        }
        //System.out.println("Anti");
        return true;
    }

    public void play(int row, int column, int player){
        if (player == 1) {
            view.getBlocks()[row][column].setText("X");
            view.getBlocks()[row][column].setEnabled(false);
            this.player = 2;
        }else{//player2
            view.getBlocks()[row][column].setText("O");
            view.getBlocks()[row][column].setEnabled(false);
            this.player = 1;
        }
    }

    public int nextPlayer(int player){
        if(player==1)
            return 2;
        else//player == 2
            return 1;
    }

    public void checkForWin(int row, int column, int player) {
        if ( checkRow(row) == true) {
            view.getPlayerturn().setText("Player " + player + " wins!");
            gameOver();
        }
        if ( checkColumn(column) == true){
            view.getPlayerturn().setText("Player " + player + " wins!");
            gameOver();
        }
        if ( row == column) {
            //System.out.println("Heyyy");
            if (checkDiagonal() == true) {
                view.getPlayerturn().setText("Player " + player + " wins!");
                gameOver();
            }
        }
        if( row+column == board_size-1) {
            //System.out.println("anti win");
            if (checkAntiDiagonal()==true){
                view.getPlayerturn().setText("Player " + player + " wins!");
                gameOver();
                }

        }

    }

    public void gameOver(){
        for(int i = 0;i<board_size;i++) {
            for(int j = 0;j<board_size;j++) {
                view.getBlocks()[i][j].setEnabled(false);
            }
        }
    }


}
