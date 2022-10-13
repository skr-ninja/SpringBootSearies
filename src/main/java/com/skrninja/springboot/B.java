package com.skrninja.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

    private A a;

    private String message = "Hi!";

   /* B(A a) {
        this.a = a;
    }*/

    @Autowired
    public void setA(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }

    public String getMessage() {
        return message;
    }
}
