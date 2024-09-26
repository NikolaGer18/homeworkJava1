package com.company;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
public class Main {

    public static void main(String[] args) throws ParseException {
        List<LibBook> libraryList = new ArrayList<>();
        libraryList.add(new LibBook("One",false));
        libraryList.add(new LibBook("Two",true));
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse("2020-12-25");
        Reader rdr = new Reader("Nikola" , date, 4.95 , "20985432");
    }
}