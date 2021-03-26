package com.example.application;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean(name = "urlUserData", eager = true)
@SessionScoped
public class UrlUserData implements Serializable {
    private static final long serialVersionUID = 1L;
    public UrlData data;

    public UrlData getData() {
        return data;
    }

    public void setData(UrlData data) {
        this.data = data;
    }
}
