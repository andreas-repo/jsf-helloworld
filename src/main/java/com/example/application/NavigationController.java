package com.example.application;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationController implements Serializable {
    private static final long serialVersionUID = 1L;
    @ManagedProperty(value = "#{param.pageId}")
    private String pageId;

    public String moveToPageOne() {
        return "page1";
    }

    public String moveToPageTwo() {
        return "page2";
    }

    public String moveToLandingPage() {
        return "index";
    }

    public String showPage() {
        if(pageId == null) {
            return "index";
        }

        if(pageId.equals("1")) {
            return "page1";
        }else if(pageId.equals("2")) {
            return "page2";
        }else {
            return "index";
        }
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
}
