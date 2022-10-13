package com.skrninja.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class A {

    private B b;

    // Using constructor  @Lazy annotation cyclic dependency Injection
  /*  A(@Lazy B b) {
        this.b = b;
    }*/

    @Autowired
    public void setB(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }
}
