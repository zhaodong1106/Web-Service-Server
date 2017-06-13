package com.zhao.webService;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWorld {
	@WebMethod
	public void say(String str);
}
