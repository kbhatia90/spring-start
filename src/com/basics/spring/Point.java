package com.basics.spring;

import org.springframework.beans.factory.BeanNameAware;

public class Point implements BeanNameAware{
	
	private int x;
	private int y;
	private String beanName;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void initMethod()
	{
		System.out.println("this is default global init method using spring xml " + beanName);
	}
	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
		
	}
	

}
