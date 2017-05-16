package com.bakigoal.test.service;


import com.bakigoal.test.beans.User;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "userService", eager = true)
@SessionScoped
public class UserService {

    @ManagedProperty(value = "#{user}")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void register(ActionEvent actionEvent) {
        System.out.println("User registered: " + user);
    }

    public List<User> getUserList() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            users.add(new User("name " + (1 + i), "pwd" + (1 + i)));
        }
        return users;
    }
}