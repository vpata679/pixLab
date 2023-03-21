//package info.gridworld.actor;

//import java.awt.Color;

/**
 * A <code>Blossom</code> is an actor that darkens over time. Some actors drop
 * flowers as they move. <br />
 * The API of this class is testable on the AP CS A and AB exams.
 */

public class Blossom extends Flower
{
    private static final Color DEFAULT_COLOR = Color.GREEN;
    private int lifetime;
    private double darkeningFactor
    private int steps;

    // lose 5% of color value in each step

    /**
     * Constructs a pink flower.
     */
    public Flower()
    {
        setColor(DEFAULT_COLOR);
        lifetime = 10;
        darkeningFactor = (10/100)
        steps = 0;
    }

    /**
     * Constructs a flower of a given color.
     * @param initialColor the initial color of this flower
     */
    public Flower(int life)
    {
        setColor(initialColor);
        lifetime = life;
        darkeningFactor = (lifetime/100);
        steps = 0;
    }

    /**
     * Causes the color of this flower to darken.
     */
    public void act()
    {
        Color c = getColor();
        int red = (int) (c.getRed() * (1 - DARKENING_FACTOR));
        int green = (int) (c.getGreen() * (1 - DARKENING_FACTOR));
        int blue = (int) (c.getBlue() * (1 - DARKENING_FACTOR));

        setColor(new Color(red, green, blue));
        if(steps >= lifetime)
        {
			removeSelfFromGrid();
		}
    }
}
