package com.marriott.devops;

public class HelloWorldDemo {

	public static final String DEMO="DEMO";
	public static final String HELLOWORLD="Hello World : ";
	public static void main(String[] args) {
		HelloWorldDemo hwdemo = new HelloWorldDemo();
		hwdemo.getHelloWorld(DEMO);

	}
public String getHelloWorld(String name) {
	return HELLOWORLD +name;
}


}
