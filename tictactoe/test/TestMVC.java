import org.junit.Test;
import static org.junit.Assert.*;

/**
 * An example test class, which merely shows how to write JUnit tests.
 */
public class TestMVC {

    @Test
    public void TestModel() {
        View v = new View();
        Model model = new Model(v);
        assertEquals (1, model.getPlayer());
        assertEquals (9, model.getMovesLeft());
        assertNotNull(model);
    }

    @Test
    public void TestView() {
        View v = new View();
        assertNotNull(v);
        assertEquals ("Player 1 to play 'X'", v.getPlayerturn().getText());
        assertEquals("Tic Tac Toe",v.getGui().getTitle());
        for(int row = 0; row<v.getBOARD_SIZE() ;row++) {
            for (int column = 0; column < v.getBOARD_SIZE(); column++) {
                assertEquals("",v.getBlocks()[row][column].getText());
            }
        }
    }


    @Test
    public void TestController(){
        View view = new View();
        Model model = new Model(view);
        Controller game = new Controller(model,view);
        //view.getReset().doClick();
        game.resetListener(model,view);

        view.getBlocks()[0][0].setText("X");
        view.getBlocks()[1][1].setText("X");
        view.getBlocks()[2][2].setText("X");

        //WORKS TOO
        view.getBlocks()[0][0].doClick(); //x
        view.getBlocks()[0][1].doClick();
        //view.getBlocks()[1][1].doClick(); //x
        //view.getBlocks()[0][2].doClick();
        //view.getBlocks()[2][2].doClick();//x

        model.checkForWin(2,2,1);
        assertEquals("Player 1 wins!",view.getPlayerturn().getText());

        view.getReset().doClick();
        assertEquals(true, game.resetListener(model,view));
        //Test if thing got reset
        TestModel();
        TestView();

    }
}
