package arraylist;

/**
 * This class represents a square that
 * takes a double for its side
 * 
 * @author chessicanation
 * Lab 3
 * CS131ON
 *
 */

public class Square 
{
	private double side;

	/**
	 * Empty-argument constructor
	 */
	public Square()
	{
		side = 0;
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor
	 * @param side
	 */
	public Square(double side) 
	{
		this.side = side;
	}//end preferred constructor
	
	/**
	 * Getter for area
	 * @return
	 */
	public double getArea()
	{
		return side * side;
	}//end getArea

	@Override
	public String toString() 
	{
		return "Square [side=" + side + "]";
	}//end toString
	
}//end class
