package com.angui.helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.angui.helloworld.model.HelloWorld;
import com.angui.helloworld.service.BusinessService;

@SpringBootTest
class HelloworldApplicationTests {
	@Autowired
	private BusinessService bs;
	@Test
	void contextLoads() {
	}
	
	@Test
	void testBusinessService() {
		
		HelloWorld hw = bs.getHelloWorld();
		assertEquals("Hello World!", hw.getValue());
	}

}
