package com.example.demo;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	public void testHelloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		assertEquals("Hello, nico", helloWorld.sayHello("nico"));
	}

}
