package com.basics.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author C45179
 *
 */
public class DrawingApplication {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
		shape = (Shape) context.getBean("triangle1");
		shape.draw();
		
		/*Triangle triangle1 = (Triangle)context.getBean("triangle1");
		Triangle triangle2 = (Triangle)context.getBean("triangle2");
		
		triangle1.draw();
		triangle2.draw();*/
	}

}
