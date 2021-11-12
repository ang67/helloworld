package com.angui.helloworld.service;

import org.springframework.stereotype.Component;

import com.angui.helloworld.model.HelloWorld;

@Component
public class BusinessService {
	
	public HelloWorld getHelloWorld() {
		HelloWorld hw = new HelloWorld();
		return hw;
	}
	
}
