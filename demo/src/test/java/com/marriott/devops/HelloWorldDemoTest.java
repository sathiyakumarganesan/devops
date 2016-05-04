package com.marriott.devops;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldDemoTest {

	@Test
	public void testHelloWorldDemo() {
		HelloWorldDemo hwd = new HelloWorldDemo();
		
		assertEquals(HelloWorldDemo.HELLOWORLD+""+HelloWorldDemo.DEMO, hwd.getHelloWorld(HelloWorldDemo.DEMO));
	}

}
