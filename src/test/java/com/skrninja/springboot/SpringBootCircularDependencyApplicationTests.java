package com.skrninja.springboot;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class SpringBootCircularDependencyApplicationTests {

    @Autowired
    ApplicationContext context;

    @Test
    void contextLoads() {
    }


    @Bean
    public A getCircularDependencyA() {
        return new A();
    }

    @Bean
    public B getCircularDependencyB() {
        return new B();
    }

    @Test
    public void givenCircularDependency_whenSetterInjection_thenItWorks() {
        A circA = context.getBean(A.class);

        Assert.assertEquals("Hi! Sunil", circA.getB().getMessage());

    }
}
