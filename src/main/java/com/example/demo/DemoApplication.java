package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.junit.Assert.assertEquals;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		HelloWorld helloWorld = new HelloWorld();
		String result = helloWorld.sayHello("Dambimbo");
		System.out.println("result: " + result);
	}

}
