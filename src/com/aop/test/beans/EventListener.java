package com.aop.test.beans;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EventListener {

	@Pointcut("execution(* com.aop.test.beans.*.startEvent())")
	public void eventStarted() {
	}

	@Before("eventStarted()")
	public void beforeEventStarted() {
		System.out.println("Before event started.");
	}
}
