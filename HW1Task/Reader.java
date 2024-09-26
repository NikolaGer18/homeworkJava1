package com.company;
import java.util.*;

public class Reader extends Student implements ReadInt,Comparable<Object> {
    private List<LibBook> LibBook = new ArrayList<>();

    public Reader(String name, Date birth, double uspeh, String f_nom) {
        super(name, birth, uspeh, f_nom);
    }

    public Reader(String nm, String fn) {
        super(nm, fn);
    }

    public List<LibBook> getLibraryBook() {
        return LibBook;
    }

    public void setLibraryBook(List<LibBook> libraryBook) {
        LibBook = libraryBook;
    }


    @Override
    public void ret(LibBook book) {

    }

    @Override
    public boolean equals(Object o) {
        return this.f_nom.equals(((Student) o).f_nom);


    }

    @Override
    public String toString() {
        return "Reader{" +
                "ime='" + name + '\'' +
                ", DOB=" + birth +
                ", uspeh=" + uspeh +
                ", Kniga=" + LibBook +
                ", f.n.='" + f_nom + '\'' +
                '}';
    }

    @Override
    public void get() {

    }

}