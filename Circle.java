//Ayush Verma
//4B
import java.util.*;
public class Circle
{
    private double radius;
    
    public Circle(double rad) 
    {
         radius = rad;
    }
    
    public double getDiameter()
    {
        return radius * 2;
    }
    
    public double getArea()
    {
        return (Math.PI * (Math.pow(radius,2)));
    }
    
    public double getCircumference()
    {
        return radius * 2 * Math.PI;
    }
}
