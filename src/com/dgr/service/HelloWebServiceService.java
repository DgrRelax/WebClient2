/**
 * HelloWebServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dgr.service;

public interface HelloWebServiceService extends javax.xml.rpc.Service {
    public java.lang.String getHelloWebServicePortAddress();

    public com.dgr.service.HelloWebService getHelloWebServicePort() throws javax.xml.rpc.ServiceException;

    public com.dgr.service.HelloWebService getHelloWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
