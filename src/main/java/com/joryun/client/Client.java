package com.joryun.client;

import com.joryun.ws.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring + CXF:
 * 1> 配置web.xml
 * 2> 编写WS接口及其实现
 * 3> 配置CXF的endpoint
 * 4> 启动Web容器
 */
public class Client {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-client.xml");
        HelloService helloService = context.getBean("helloService", HelloService.class);
        String result = helloService.say("CXF");
        System.out.println(result);
    }
}
