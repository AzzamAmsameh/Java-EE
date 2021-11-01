package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author lenovo
 *
 */
public class EntryPoint {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Sport football = context.getBean("mySport",Sport.class);
		// call methods on the bean
		football.start();
		// close the context
		context.close();
	}
}
