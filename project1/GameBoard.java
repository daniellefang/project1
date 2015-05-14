 
//makes the frame that the game will apear, a.k.a. the window
import javax.swing.JFrame;

public class GameBoard extends JFrame {
    public GameBoard()
    {
        //uses the board class to make the game
        add(new Board());
        
        //the window closes when the x button is clicked
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //sets the size of the window
        setSize(600,600);
        //centers he window
        setLocationRelativeTo(null);
        //sets the name of the window
        setTitle("Super not-Mario");
        //window can not be resized
        setResizable(false);
        //able to be seen
        setVisable(true);
    }
    public static void main(String[] args)
    {    new GameBoard();
    }
}
