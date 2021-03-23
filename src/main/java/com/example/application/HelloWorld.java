package com.example.application;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class HelloWorld {
    @ManagedProperty(value = "#{message}")
    private Message messageBean;
    private String message;

    public HelloWorld() {
        System.out.println("HelloWorld started");
    }

    public String getMessage() {
        if(messageBean != null) {
            this.message = messageBean.getMessage();
        }

        return this.message;
    }

    public void setMessageBean(Message message) {
        this.messageBean = message;
    }
}
