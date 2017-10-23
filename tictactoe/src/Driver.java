public class Driver {

    //View view;
    //Model model;

    public Driver(){

    }

    /**
     * The main method that starts the game.
     */
    public static void main(String[] args) {

        View view = new View();
        Model model = new Model(view);
        Controller controller = new Controller(model,view);

        //Driver game = new Driver();
        view.getGui().setVisible(true);
    }

}
