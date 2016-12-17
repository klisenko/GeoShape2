/**
 * 
 */
package cp120.assignments.geo_shape;

import java.awt.Point;

/**
 * @author Jack Lisenko
 *
 */
public class GeoPoint {
	private float xco = 0;
	private float yco = 0;	
	
	/**
	 * @param xco
	 * @param yco
	 */
	public GeoPoint(float xco, float yco) {
		super();
		this.xco = xco;
		this.yco = yco;
	}

	/**
	 * @return the coordinates as a point
	 * rounded to nearest integer 
	 */
	public Point getIntPoint() {
		return new Point(Math.round(xco), Math.round(yco));
	}
	
	/**
	 * @return the distance between this GeoPoint
	 * another GeoPoint 
	 */
	public float distance( GeoPoint other ) {
		float xcoOther = other.getXco();
		float ycoOther = other.getYco();
		double distance = Math.sqrt(Math.pow(xco - xcoOther, 2) + Math.pow(yco - ycoOther, 2));
		
		return (float)distance;
	}
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {		
		return "(" + xco + "," + yco + ")";
	}




	/**
	 * @return the xco
	 */
	public float getXco() {
		return xco;
	}
	
	/**
	 * @param xco the xco to set
	 */
	public void setXco(float xco) {
		this.xco = xco;
	}
	
	/**
	 * @return the yco
	 */
	public float getYco() {
		return yco;
	}
	
	/**
	 * @param yco the yco to set
	 */
	public void setYco(float yco) {
		this.yco = yco;
	}
}
