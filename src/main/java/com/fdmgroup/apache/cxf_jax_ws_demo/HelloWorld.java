package com.fdmgroup.apache.cxf_jax_ws_demo;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}

