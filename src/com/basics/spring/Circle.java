/**
 * 
 */
package com.basics.spring;

/**
 * @author C45179
 *
 */
public class Circle implements Shape{
	
	private Point centre;

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	@Override
	public void draw() {
		System.out.println("Circle drawn");
		System.out.println(centre.getX()+","+centre.getY());
		
	}

}
