package com.company;
import java.util.*;
public class kandidat {
    protected String name;
    protected Date birth;
    protected double uspeh;

    public kandidat(String name, Date birth, double uspeh) {
        this.name = name;
        this.birth = birth;
        this.uspeh = uspeh;
    }

    public String toString() {
        return "ime='" + name + '\'' +
                ", DOB=" + birth +
                ", uspeh=" + uspeh
                ;
    }

    public kandidat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public double getUspeh() {
        return uspeh;
    }

    public void setUspeh(double uspeh) {
        this.uspeh = uspeh;
    }


}
