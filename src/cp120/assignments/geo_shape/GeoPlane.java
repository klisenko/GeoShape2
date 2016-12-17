/**
 * 
 */
package cp120.assignments.geo_shape;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack Lisenko
 *
 */
public class GeoPlane {
	private List<GeoShape> shapes = new ArrayList<GeoShape>();
	
	public void addShape( GeoShape shape ) {
		shapes.add(shape);
	}
	
	public void removeShape( GeoShape shape ) {
		shapes.remove(shape);
	}
	
	public void redraw() {
		for (GeoShape p : shapes) {
			p.draw(null);
		}
	}

}
