package com.example.application;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean(name = "conditionalNavigationController", eager = true)
@RequestScoped
public class ConditionalNavigationController implements Serializable {
    //this managed property will read value from request parameter pageId
    @ManagedProperty(value = "#{param.testPageId}")
    public String testPageId = "3";

    //conditional navigation based on pageId
    //if pageId is 1 show page1.xhtml,
    //if pageId is 2 show page2.xhtml
    //else show index.xhtml
    public String showPage() {
        if(this.testPageId == null) {
            return "index";
        }

        if(this.testPageId.equals("1")) {
            return "page1";
        } else if(this.testPageId.equals("2")) {
            return "page2";
        } else {
            return "index";
        }
    }
}
