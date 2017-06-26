package com.basics.spring;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean{

	private List<Point> points;
	private ApplicationContext context = null;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw()
	{
		
		for (Point point : points)
				System.out.println(point.getX()+" "+point.getY());
	
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println(beanName);
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("bean destruction by spring using DisposableBean interface");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("bean init by spring using InitializeBean interface ");
		
	}
	
	public void initMethod()
	{
		System.out.println("this is init method for triangle1 by using spring xml");
	}
	
	public void cleanup()
	{
		System.out.println("this is cleanup method for triangle1 bean by using spring xml");
	}

}
