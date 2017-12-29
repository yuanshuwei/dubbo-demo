package com.ys.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Provider
 *
 * @auhtor yswit@outlook.com
 * @create 2017-12-28 下午4:05
 */
public class Provider {

    public static void main(String[] args) throws IOException {
        //Prevent to get IPV6 address,this way only work in debug mode
        //But you can pass use -Djava.net.preferIPv4Stack=true,then it work well whether in debug mode or not
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"/dubbo-demo-provider.xml"});
        context.start();

        System.in.read(); // press any key to exit
    }
}
