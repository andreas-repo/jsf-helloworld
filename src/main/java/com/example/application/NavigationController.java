package com.example.application;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationController implements Serializable {
    private static final long serialVersionUID = 1L;
    public String moveToPageTwo() {
        return "page2";
    }

    public String moveToLandingPage() {
        return "index";
    }
}
