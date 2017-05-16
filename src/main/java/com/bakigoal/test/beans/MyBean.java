package com.bakigoal.test.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@ManagedBean(eager = true)
@RequestScoped
public class MyBean implements Serializable {

    @Size(min = 3, message = "At least 3 characters")
    private String name;
    @Min(18)
    @Max(25)
    private int age;
    @Pattern(regexp = "[0-9]{5}")
    private String zip;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
