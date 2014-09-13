package com.aop.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.test.beans.EventWithInterface;

public class App {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/aop/test/beans.xml");
		
		
		Object dummy = context.getBean("dummyBean");
		System.out.println("Class of component that does not take part in AOP (is not an aspect nor hits pointcut): " + dummy.getClass());
		
		Object event = context.getBean("event");
		System.out.println("Class of event that takes part in AOP and does not implement interfaces: " + event.getClass());
		
		
		Object eventUsingInterface = context.getBean("eventWithInterface");
		System.out.println("Class of event that takes part in AOP and implements interfaces: " + eventUsingInterface.getClass());
		
		
		System.out.println("Now let's try to cast last bean to it's proper class:");
		
		//UNCOMMENT TO SEE SOME MAGIC
//		EventWithInterface castedEventUsingInterface = (EventWithInterface)context.getBean("eventWithInterface");
		
		
		
		context.close();
	}

}
