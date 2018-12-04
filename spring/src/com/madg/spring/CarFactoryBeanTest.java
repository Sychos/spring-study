package com.madg.spring;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author:Madg
 * @Date:2018/12/4/004 20:05
 */
class CarFactoryBeanTest
{
    @Test
    public void test()
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("context.xml");

        Car car= (Car) context.getBean("car");
        System.out.println(car);
    }
}