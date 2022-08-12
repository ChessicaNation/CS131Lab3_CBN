package arraylist;

/**
 * This class represents a 3D object that
 * takes doubles as its three points
 * 
 * @author chessicanation
 * Lab 3
 * CS131ON
 *
 */

public class PointThreeD 
{
	private double xPoint;
	private double yPoint;
	private double zPoint;
	
	/**
	 * Empty-argument constructor
	 */
	public PointThreeD()
	{
		xPoint = 0;
		yPoint = 0;
		zPoint = 0;
	}//end empty-argument constructor
	
	/**
	 * Preferred constructor
	 * @param x
	 * @param y
	 * @param z
	 */
	public PointThreeD(double x, double y, double z)
	{
		xPoint = x;
		yPoint = y;
		zPoint = z;
	}//end preferred constructor

	@Override
	public String toString() {
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}//end toString
	
}//end class
