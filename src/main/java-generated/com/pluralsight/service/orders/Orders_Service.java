package com.pluralsight.service.orders;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.8
 * 2017-09-01T11:56:14.870-04:00
 * Generated source version: 2.7.8
 * 
 */
@WebServiceClient(name = "Orders", 
                  wsdlLocation = "file:/C:/Users/ketan.sharma/JavaEclipseWorkspace/apache.cxf-jax-ws-demo/src/main/resources/wsdl/Orders.wsdl",
                  targetNamespace = "http://www.pluralsight.com/service/Orders/") 
public class Orders_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.pluralsight.com/service/Orders/", "Orders");
    public final static QName OrdersSOAP = new QName("http://www.pluralsight.com/service/Orders/", "OrdersSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/ketan.sharma/JavaEclipseWorkspace/apache.cxf-jax-ws-demo/src/main/resources/wsdl/Orders.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Orders_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/ketan.sharma/JavaEclipseWorkspace/apache.cxf-jax-ws-demo/src/main/resources/wsdl/Orders.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Orders_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Orders_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Orders_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Orders_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Orders_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Orders_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns Orders
     */
    @WebEndpoint(name = "OrdersSOAP")
    public Orders getOrdersSOAP() {
        return super.getPort(OrdersSOAP, Orders.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Orders
     */
    @WebEndpoint(name = "OrdersSOAP")
    public Orders getOrdersSOAP(WebServiceFeature... features) {
        return super.getPort(OrdersSOAP, Orders.class, features);
    }

}