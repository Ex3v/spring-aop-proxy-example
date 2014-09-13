package com.aop.test.beans;

import org.springframework.stereotype.Component;

@Component
public class Event {

	public void startEvent() {
		System.out.println("Event started.");
	}

}
