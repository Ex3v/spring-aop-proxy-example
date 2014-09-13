package com.aop.test.beans;

import org.springframework.stereotype.Component;

@Component
public class EventWithInterface implements EventInterface {

	@Override
	public void startEvent() {
		System.out.println("Event that uses interface started.");

	}

}
