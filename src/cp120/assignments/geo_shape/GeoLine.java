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
public class GeoLine extends GeoShape {
	
	GeoPoint end;

	/**
	 * @param origin
	 * @param color
	 * @param end
	 */
	public GeoLine(GeoPoint origin, Color color, GeoPoint end) {
		super(origin, color);
		this.end = end;
	}
	
	/**
	 * @param origin
	 * @param end
	 */
	public GeoLine(GeoPoint origin, GeoPoint end) {
		this(origin, DEFAULT_COLOR, end);
	}
	
	/* (non-Javadoc)
	 * @see cp120.assignments.geo_shape.GeoRectangle#draw(java.awt.Graphics2D)
	 * Drawing line: origin=(10.02,10.03),color=#00ffff,end=(-5.0,-7.2)
	 */
	@Override
	public void draw(Graphics2D gtx) {
		String arg1 = this.toString();
		String output = String.format("Drawing line: %s", arg1);
		System.out.println(output);
	}

	/**
	 * @return the end
	 */
	public GeoPoint getEnd() {
		return end;
	}

	/**
	 * @param end the end to set
	 */
	public void setEnd(GeoPoint end) {
		this.end = end;
	}

	/* 
	 * @return origin
	 */
	public GeoPoint getStart() {
		return super.getOrigin();
	}

	/*
	 * @param origin
	 */
	public void setStart(GeoPoint origin) {
		super.setOrigin(origin);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * origin=(5.1,6.2),color=#ff0000,end=(-3.7,-5.4)
	 */
	@Override
	public String toString() {
		String arg1 = super.toString();
		String arg2 = end.toString();
		String output = String.format("%s,end=%s", arg1, arg2);
		return output;
	}
	
	

}
