package com.codingexercise.model;

public class Greeting {
	private final String hello;
	
	public Greeting() {
		this.hello = "world";
	}
	
	public Greeting(String hello) {
		this.hello = hello;		
	}

	public String getHello() {
		return hello;
	}
	
}
