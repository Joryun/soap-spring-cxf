package com.joryun.ws.Impl;

import com.joryun.ws.HelloService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

@WebService
@Component
public class HelloServiceImpl implements HelloService {

    public String say(String name) {
        return "hello " + name;
    }
}
