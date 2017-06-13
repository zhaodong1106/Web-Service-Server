package com.zhao.webService;

import javax.xml.ws.Endpoint;

public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address = "http://Localhost:8989/WS_Server/webService";
		Endpoint.publish(address, new HelloWorldImpl());
		System.out.println("发布webservice成功!");
	}

}
