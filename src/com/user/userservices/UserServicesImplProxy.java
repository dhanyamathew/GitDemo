package com.user.userservices;

public class UserServicesImplProxy implements com.user.userservices.UserServicesImpl {
  private String _endpoint = null;
  private com.user.userservices.UserServicesImpl userServicesImpl = null;
  
  public UserServicesImplProxy() {
    _initUserServicesImplProxy();
  }
  
  public UserServicesImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initUserServicesImplProxy();
  }
  
  private void _initUserServicesImplProxy() {
    try {
      userServicesImpl = (new com.user.userservices.UserServicesImplServiceLocator()).getUserServicesImpl();
      if (userServicesImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)userServicesImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)userServicesImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (userServicesImpl != null)
      ((javax.xml.rpc.Stub)userServicesImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.user.userservices.UserServicesImpl getUserServicesImpl() {
    if (userServicesImpl == null)
      _initUserServicesImplProxy();
    return userServicesImpl;
  }
  
  public com.user.userservices.User addUser(java.lang.String firstName, java.lang.String lastName, java.lang.String middleName) throws java.rmi.RemoteException{
    if (userServicesImpl == null)
      _initUserServicesImplProxy();
    return userServicesImpl.addUser(firstName, lastName, middleName);
  }
  
  public com.user.userservices.User getUser(long userId) throws java.rmi.RemoteException{
    if (userServicesImpl == null)
      _initUserServicesImplProxy();
    return userServicesImpl.getUser(userId);
  }
  
  
}