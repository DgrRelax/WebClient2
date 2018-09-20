package com.dgr.service;

public class HelloWebServiceProxy implements com.dgr.service.HelloWebService {
  private String _endpoint = null;
  private com.dgr.service.HelloWebService helloWebService = null;
  
  public HelloWebServiceProxy() {
    _initHelloWebServiceProxy();
  }
  
  public HelloWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloWebServiceProxy();
  }
  
  private void _initHelloWebServiceProxy() {
    try {
      helloWebService = (new com.dgr.service.HelloWebServiceServiceLocator()).getHelloWebServicePort();
      if (helloWebService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloWebService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloWebService != null)
      ((javax.xml.rpc.Stub)helloWebService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.dgr.service.HelloWebService getHelloWebService() {
    if (helloWebService == null)
      _initHelloWebServiceProxy();
    return helloWebService;
  }
  
  public java.lang.String helloService1(java.lang.String arg0) throws java.rmi.RemoteException{
    if (helloWebService == null)
      _initHelloWebServiceProxy();
    return helloWebService.helloService1(arg0);
  }
  
  
}