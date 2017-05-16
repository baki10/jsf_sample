package com.bakigoal.test.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;
import java.io.Serializable;

@ManagedBean(name = "user", eager = true)
@SessionScoped
public class User implements Serializable {

    private String name;
    private String password;
    private String status;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void checkFormat(AjaxBehaviorEvent evt) {
        if (name != null) {
            if (name.length() > 20) {
                status = "Name length must be <= 20";
            }
        }
        if (password != null) {
            if (password.equals(password.toLowerCase())) {
                status = "Password must contain uppercase letter";
            }
        }
    }

    public void login(ActionEvent evt) {
        if (name.equals(password))
            status = "Login successful";
        else
            status = "Login failed";
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}