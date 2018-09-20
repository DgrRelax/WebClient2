package com.dgr.client;

import java.rmi.RemoteException;

import com.dgr.service.HelloWebService;
import com.dgr.service.HelloWebServiceProxy;

public class Test {
	public static void main(String[] args) {
		HelloWebService webService = new HelloWebServiceProxy().getHelloWebService();
		try {
			String result = webService.helloService1("Invoking WebClient2 method");
			System.out.println(result);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
