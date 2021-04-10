package jge;
import java.awt.Color;
import java.util.ArrayList;

public class Entity 
{
    double x, y;
    int width, height;
    Color color = Color.RED;
    ArrayList<Component> components = new ArrayList<Component>();

    public void addComponent(Component c)
    {
        c.entity = this;
        components.add(c);
    }

    public Entity(double x, double y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
