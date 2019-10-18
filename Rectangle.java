/**
 * A <code>Rectangle</code> object represents a Rectangle with
 * a width, height, color, (x,y) position, and boolean filled
 * @author JosephSalerno
 * @author BrendanOlski
 * @author MitchellThomas
 * Class: Rectangle.java
 * Project: 3
 */
public class Rectangle extends StraightLineShape{

	// Class variables
	public static final String DEFAULT_COLOR = "Black";
	public static final int DEFAULT_RECT_WIDTH = 1;
	public static final int DEFAULT_RECT_HEIGHT = 2;
	public static final int DEFAULT_POSITION = 0;
	public static final boolean DEFAULT_FILL = false;
	
	//instance variables
	private int[] xCoords;
	private int[] yCoords; 
	private int width;
	private int height;
	private int x;
	private int y;
	private boolean filled;
	private String color;
	
	/**
	 * Constructor to create a Rectangle given a width, height, color, fill, and position x and y,
	 * additionally calculating the coordinate locations of the shape.
	 * @param width - integer width for the sides of the square
	 * @param height - integer height for the sides of the square
	 * @param color - A string representing the color of the shape
	 * @param x - the x coordinate of the shape
	 * @param y - the y coordinate of the shape
	 * @param filled - boolean representing if the shape is filled or not
	 *
	 */
	public Rectangle(String color, int x, int y, int width, int height, boolean filled) {
		super("Rectangle");
		
		this.color = color;      
		this.x = x;      
		this.y = y;   
		this.width = width;
		this.height = height;
		this.filled = filled;
		this.calculateCoords();
		
	}

	/**
	 * Constructor to create a Rectangle with no givens, only DEFAULTS,
	 * calculates coords with DEFAUlTS.
	 */
	public Rectangle() {
		
		this(DEFAULT_COLOR, DEFAULT_POSITION, DEFAULT_POSITION, DEFAULT_RECT_WIDTH, DEFAULT_RECT_HEIGHT, DEFAULT_FILL);
		this.calculateCoords();
	}
	
	/**
	 * Returns the width of the Shape
	 * @return the integer width of the Shape
	 */
	public int getWidth() {
		return width;
	}
	
	/**
	 * Returns the height of the Shape
	 * @return the integer height of the Shape
	 */
	public int getHeight() {
		return height;
	}
	
	/**
	 * Returns the color of the Shape
	 * @return String of the color of the Shape
	 */
	public String getColor() {
		return color;
	}
	
	
	/**
	 * Returns the x position of the Shape
	 * @return x position of the Shape
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Returns the y position of the Shape
	 * @return y position of the Shape
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Returns the int[] of xCoords of the Shape
	 * @return integer array containing the x coordinates
	 */
	public int[] getXCoordinates()
	{
		return xCoords;
	}
	
	/**
	 * Returns the int[] of yCoords of the Shape
	 * @return integer array containing the y coordinates
	 */
	public int[] getYCoordinates()
	{
		return yCoords;
	}
	
	/**
	 * Sets the width to a new value, update coords
	 * @param newWidth - new width of the Rectangle
	 */
	public void setWidth(int newWidth) {
		this.width = newWidth;
		this.calculateCoords();
	}
	
	/**
	 * Sets the height to a new value, update coords
	 * @param newHeight - new height of the Rectangle
	 */
	public void setHeight(int newHeight) {
		this.height = newHeight;
		this.calculateCoords();
	}
	
	
	/**
	 * Sets the Rectangle color to a new color
	 * @param newColor - new color string of the Rectangle
	 */
	public void setColor(String newColor) {
		this.color = newColor;
	}
	
	
	/**
	 * Sets the x position to a new value, update coords
	 * @param newX - new x position of the Rectangle
	 */
	public void setX(int newX) {
		this.x = newX;
		this.calculateCoords();
	}
	
	
	/**
	 * Sets the y position to a new value, update coords
	 * @param newY - new y position of the Rectangle
	 */
	public void setY(int newY) {
		this.y = newY;
		this.calculateCoords();
	}
	
	/**
	 * Returns a boolean showing the user whether this shape is filled or not
	 * @return boolean relating to whether or not the shape is filled
	 */
	public boolean isFilled() {
		return filled;
	}
	
	/**
	 * Sets the fill to a new value
	 * @param newFill - new fill boolean of the Rectangle
	 */
	public void setFill(boolean newFill)
	{
		this.filled = newFill;
	}

	
	/**
	 * Sets the coordinates in the arrays xCoords and yCoords
	 */
	public void calculateCoords() {
		
		xCoords[0] = x;
		xCoords[1] = x + width;
		xCoords[2] = x + width;
		xCoords[3] = x;
		
		yCoords[0] = y;
		yCoords[1] = y;
		yCoords[2] = y+height;
		yCoords[3] = y+height;
	}
	
	
	/**
	 * Returns a double[] with the sides of the Rectangle
	 * @return a double array with all 4 sides of the Rectangle
	 */
	public double[] getSides() {
		double[] sides = new double[4];
		sides[0] = sides[2] = width;
		sides[1] = sides[3] = height;
		return sides;
	}
	
	
	/**
	 * Returns the perimeter of the Rectangle
	 * @return the perimeter as a double
	 */
	public double getPerimeter() {
		return (height * 2) + (width * 2);
	}
	
	
	/**
	 * Compares this Rectangle to another one
	 * @param other - Rectangle object for comparison
	 * @return integer 0 if equal, -1 if less than, 1 if greater than other Rectangle
	 */
	public int compareTo(Rectangle other) {
		//calculate area for comparison
		  double rArea = (this.height * this.width);
		  double rOtherArea = (other.getHeight() * other.getWidth());
		  
		  if (rArea == rOtherArea) {
		         return 0;
		      } 
		  else if (rArea < rOtherArea) {
		         return -1;
		      } 
		  else {
		         return 1;
		  }
	}
	
	/**
	 * Returns the string representation of the Rectangle
	 * @return a string representing the Rectangle
	 */
	public String toString() {
		String str = "===Rectangle===";
		str += "Height: " + height + "\n";
		str += "Width: " + width + "\n"; 
		str += "Coordinates: ";

	    for(int index = 0; index<xCoords.length; ++index)
	      {
	    	  str+= "(" + xCoords[index] + "," + yCoords[index] + "), ";
	      }
	      
		str += "Position: " + x + "," + y + "\n";
		str += "Color: " + color + "\n";
	    str += "Filled: " + filled;
	    
	    double[] sides = getSides();
	    for(int x = 0; x<sides.length; x++)
	      {
	    	  str += "Side " + (x + 1) + ": " + sides[x] + "\n";
	      }
	    str += "Perimeter: " + getPerimeter() + "\n";
	    str += "\n==========\n";
	    return str;
	    
	}
	   
}