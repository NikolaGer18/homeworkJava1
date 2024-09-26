package com.company;
import java.util.*;

public class Student extends kandidat implements Comparable<Object>{
    protected String f_nom;
    public Student(String name, Date birth, double uspeh,String f_nom) {
        super(name, birth, uspeh);
        this.f_nom = f_nom;
    }


    @Override
    public boolean equals(Object o){
        return this.f_nom.equals(((Student)o).f_nom);

 }

    public Student(String name, String f_nom) {
        super(name);
        this.f_nom = f_nom;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
