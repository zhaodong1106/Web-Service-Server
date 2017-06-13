package com.zhao.webService;

import javax.jws.WebService;

@WebService(endpointInterface="com.zhao.webService.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	/**
	 * @param args
	 */
	

	@Override
	public void say(String str) {
		// TODO Auto-generated method stub
		System.out.println("i am is a str!!!!!!!!!!!!");
	}

}
