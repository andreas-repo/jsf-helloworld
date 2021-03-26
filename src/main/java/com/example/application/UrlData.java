package com.example.application;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

public class UrlData {
    private String url;

    public UrlData(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String toString() {
        return url;
    }
}
