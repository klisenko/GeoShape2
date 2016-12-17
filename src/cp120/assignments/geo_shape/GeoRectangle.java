/**
 * 
 */
package cp120.assignments.geo_shape;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * @author Jack Lisenko
 *
 */
public class GeoRectangle extends GeoShape {
	
	private double width = 0;
	private double height = 0;

	/**
	 * @param origin
	 * @param color
	 * @param width
	 * @param height
	 */
	public GeoRectangle(GeoPoint origin, Color color, double width, double height) {
		super(origin, color);
		this.width = width;
		this.height = height;
	}
	
	/**
	 * @param width
	 * @param height
	 */
	public GeoRectangle(double width, double height) {
		this( DEFAULT_ORIGIN, DEFAULT_COLOR, width, height );
	}
	
	/**
	 * @param origin
	 * @param width
	 * @param height
	 */
	public GeoRectangle(GeoPoint origin, double width, double height) {
		this( origin, DEFAULT_COLOR, width, height );
	}
	
	

	/* (non-Javadoc)
	 * @see cp120.assignments.assignment006.GeoShape#draw(java.awt.Graphics2D)
	 * Drawing rectangle: origin=(10.02,10.03),color=#ffff00,width=6.6,height=5.5
	 */
	@Override
	public void draw(Graphics2D gtx) {
		String arg1 = this.toString();
		String output = String.format("Drawing rectangle: %s", arg1);
		System.out.println(output);
	}

	/**
	 * @return the area of the rectangle
	 */
	public double area() {
		return height * width;
	}
	
	/**
	 * @return the perimeter of the rectangle
	 */
	public double perimeter() {
		return 2*height + 2 * width;
	}	
	
	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/* (non-Javadoc)
	 * @see cp120.assignments.assignment006.GeoShape#toString()
	 * origin=(7.7,8.8),color=#00ff00,width=6.6,height=5.5
	 */
	@Override
	public String toString() {
		String arg1 = super.toString();
		return String.format("%s,width=%s,height=%s", arg1, width, height);
	}
	
	

}
