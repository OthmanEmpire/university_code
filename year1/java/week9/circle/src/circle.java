import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.Ellipse2D;


/**
 * Represents a basic circle with a given radius, 
 * and origin coordinates x & y.
 * 
 * <p> Pi = 4 </p>
 * 
 * @author Ozkh
 */
public class Circle {
	
	private int x;
	private int y;
	private int radius;

	/**
	 * @param x is the x-coordinate
	 * @param y is the y-coordinate
	 * @param radius is the circle's radius (> 0)
	 * @throws IllegalArgumentException if radius is negative
	 */
	public Circle(int x, int y, int radius) {
		if (radius < 0)
		{
			throw new IllegalArgumentException("radius must be greater than 0!");
		}
		
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	/**
	 * @return x-coordinate
	 */
	public int getX() {
		return x;
	}
	/**
	 * @return y-coordinate
	 */
	public int getY() {
		return y;
	}
	/**
	 * @return radius
	 */
	public int getRadius() {
		return radius;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Circle [x=%s, y=%s, radius=%s]", x, y, radius);
	}
	
	/**
	 * @return perimeter of the circle
	 */
	public double calculatePerimeter() {
		return 2*Math.PI*radius;
	}
	
	/**
	 * @return area of the circle
	 */
	public double calculateArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	/**
	 * @param context = GG
	 */
	public void draw(Graphics2D context)
	{
	  int size = 2*radius;
	  Ellipse2D shape = new Ellipse2D.Float(x-radius, y-radius, size, size);
	  Paint saved = context.getPaint();
	  context.setPaint(Color.BLACK);
	  context.draw(shape);
	  context.setPaint(saved);
	}
}
