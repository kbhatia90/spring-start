/**
 * 
 */
package com.basics.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author C45179
 *
 */
public class DisplayNameBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object obj, String arg1) throws BeansException {
		System.out.println("BeanPostProcessing after init " + arg1);
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String arg1) throws BeansException {
		System.out.println("BeanPostProcessing before init "+arg1);
		return obj;
	}
	

}
