
package com.deitel.welcomesoap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WelcomeSOAP", targetNamespace = "http://welcomesoap.deitel.com/", wsdlLocation = "http://localhost:8080/WelcomeSOAP/WelcomeSOAP?WSDL")
public class WelcomeSOAP_Service
    extends Service
{

    private final static URL WELCOMESOAP_WSDL_LOCATION;
    private final static WebServiceException WELCOMESOAP_EXCEPTION;
    private final static QName WELCOMESOAP_QNAME = new QName("http://welcomesoap.deitel.com/", "WelcomeSOAP");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/WelcomeSOAP/WelcomeSOAP?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WELCOMESOAP_WSDL_LOCATION = url;
        WELCOMESOAP_EXCEPTION = e;
    }

    public WelcomeSOAP_Service() {
        super(__getWsdlLocation(), WELCOMESOAP_QNAME);
    }

    public WelcomeSOAP_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WELCOMESOAP_QNAME, features);
    }

    public WelcomeSOAP_Service(URL wsdlLocation) {
        super(wsdlLocation, WELCOMESOAP_QNAME);
    }

    public WelcomeSOAP_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WELCOMESOAP_QNAME, features);
    }

    public WelcomeSOAP_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WelcomeSOAP_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WelcomeSOAP
     */
    @WebEndpoint(name = "WelcomeSOAPPort")
    public WelcomeSOAP getWelcomeSOAPPort() {
        return super.getPort(new QName("http://welcomesoap.deitel.com/", "WelcomeSOAPPort"), WelcomeSOAP.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WelcomeSOAP
     */
    @WebEndpoint(name = "WelcomeSOAPPort")
    public WelcomeSOAP getWelcomeSOAPPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://welcomesoap.deitel.com/", "WelcomeSOAPPort"), WelcomeSOAP.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WELCOMESOAP_EXCEPTION!= null) {
            throw WELCOMESOAP_EXCEPTION;
        }
        return WELCOMESOAP_WSDL_LOCATION;
    }

}
