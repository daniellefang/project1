
/**
 * Write a description of class Platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int length;
    private int width;

    /**
     * Constructor for objects of class Platform
     */
    public Platform(int xpos, int ypos, int l, int w)
    {
        // initialise instance variables
        x = xpos;
        y = ypos;
        length = l;
        width = w;
    }
    
    public int getXCoord()
    {
        return x;
    }
    
    public int getYCoord()
    {
        return y;
    }
    
    public int getLength()
    {
        return length;
    }
    
    public int getWidth()
    {
        return width;
    }
}
