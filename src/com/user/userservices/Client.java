package com.user.userservices;

import java.rmi.RemoteException;

public class Client {
	
	public static void main(String[] args) throws RemoteException {
		
		UserServicesImplProxy proxy = new UserServicesImplProxy();
		System.out.println(proxy.addUser("This", "is", "test"));
		System.out.println(proxy.getUser(25));
		
	}

}
