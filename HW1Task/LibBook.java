package com.company;

public class LibBook implements LibBookInt,Comparable  {
    private Reader reader;
    private String bookName;
    private boolean status;

    public LibBook(String bookName)
    {
        this.bookName = bookName;
    };

    public LibBook(String bookName, boolean status)
    {
        this.bookName = bookName;
        this.status = status;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void get(Reader rdr) {
    }

    @Override
    public void ret() {

    }

    @Override
    public int compareTo(Object o) {
        return this.reader.compareTo(((LibBook)o).reader);
    }
}
