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
public class GeoOval extends GeoRectangle {
	
	

	/**
	 * @param width
	 * @param height
	 */
	public GeoOval(double width, double height) {
		this(DEFAULT_ORIGIN, DEFAULT_COLOR, width, height);
	}

	/**
	 * @param origin
	 * @param color
	 * @param width
	 * @param height
	 */
	public GeoOval(GeoPoint origin, Color color, double width, double height) {
		super(origin, color, width, height);
	}

	/**
	 * @param origin
	 * @param width
	 * @param height
	 */
	public GeoOval(GeoPoint origin, double width, double height) {
		this(origin, DEFAULT_COLOR, width, height);
	}

	/* (non-Javadoc)
	 * @see cp120.assignments.assignment006.GeoRectangle#draw(java.awt.Graphics2D)
	 */
	@Override
	public void draw(Graphics2D gtx) {
		String arg1 = super.toString();
		String output = String.format("Drawing oval: %s", arg1);
		System.out.println(output);
	}
}
