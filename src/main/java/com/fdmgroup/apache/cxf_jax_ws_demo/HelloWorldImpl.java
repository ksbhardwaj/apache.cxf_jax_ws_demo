
package com.fdmgroup.apache.cxf_jax_ws_demo;

import javax.jws.WebService;

@WebService(endpointInterface = "com.pluralsight.cxfdemo.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}


