package com.basics.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DrawingApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle)context.getBean("triangle1");
		
		triangle.draw();
	}

}
