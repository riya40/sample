package com.bridgelabz.csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AddressbookReader {
    public boolean loaddatauseiterator()throws FileNotFoundException {
        Scanner sc = new Scanner(new File("E:\\java\\addressbook1.csv"));
        sc.useDelimiter(":");   //sets the delimiter pattern
        while (sc.hasNext())  //returns a boolean value
        {
            System.out.print(sc.next());  //find and returns the next complete token from this scanner
        }
        sc.close();
        return false;
    }

    public static void main( String[] args ) throws FileNotFoundException {
        System.out.println( "Welcome to StateCenSusAnalyser" );
        AddressbookReader addressbookReader=new AddressbookReader();
        addressbookReader.loaddatauseiterator();
    }
}
