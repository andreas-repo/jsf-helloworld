package com.example.application;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationController implements Serializable {

    public String moveToPageTwo() {
        return "page2";
    }

    public String moveToLandingPage() {
        return "index";
    }
}
