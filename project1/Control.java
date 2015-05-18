
/**
 * Write a description of class Control here.
 * The control class controls the movement of a sprite
 * @author (Danielle) 
 * @version (5/5/15)
 */
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
public class Control
{
    private String sprite = "TempMario.png";
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;

    public Control()
    {
        ImageIcon icon = new ImageIcon(this.getClass().getResource(sprite));
        image = icon.getImage();
        x = 300;
        y = 300;
    }

    public void move()
    {
        x += dx;
        y += dy;
    }

    public int getX() 
    {
        return x;
    }

    public int getY() 
    {
        return y;
    }

    public Image getImage() 
    {
        return image;
    }

    public void keyPressed(KeyEvent k) 
    {
        int key = k.getKeyCode();
        if (key == KeyEvent.VK_LEFT)
            dx = -1;
        if (key == KeyEvent.VK_RIGHT)
            dx = 1;
        if (key == KeyEvent.VK_UP)
            dy = -1;
        if (key == KeyEvent.VK_DOWN)
            dy = 1;
    }

    public void keyReleased(KeyEvent k) 
    {
        int key = k.getKeyCode();
        if (key == KeyEvent.VK_LEFT) 
            dx = 0;
        if (key == KeyEvent.VK_RIGHT) 
            dx = 0;
        if (key == KeyEvent.VK_UP)
            dy = 0;
        if (key == KeyEvent.VK_DOWN)
            dy = 0;
    }
    
    public boolean isTouching (Platform plat)
    {
       // if (x >= plat.getXCoord() && x <= plat.getXCoord() + 
            dy = 0;
        
       return false;
    }
}
