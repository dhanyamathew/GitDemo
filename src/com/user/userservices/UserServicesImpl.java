/**
 * UserServicesImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.user.userservices;

public interface UserServicesImpl extends java.rmi.Remote {
    public com.user.userservices.User addUser(java.lang.String firstName, java.lang.String lastName, java.lang.String middleName) throws java.rmi.RemoteException;
    public com.user.userservices.User getUser(long userId) throws java.rmi.RemoteException;
}
