package com.bridgelabz.csv;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class AddressBook {
    public boolean loaddata() throws Exception{
        //Instantiating the CSVReader class
        CSVReader reader;
        reader = new CSVReader(new FileReader("E:\\java\\addressbook1.csv"));
        //Reading the contents of the csv file
        StringBuffer buffer = new StringBuffer();
        String line[];
        while ((line = reader.readNext()) != null) {
            for(int i = 0; i<line.length; i++) {
                System.out.print(line[i]+" ");
            }
            System.out.println(" ");
        }
        return false;
    }

    public static void main(String args[]) throws Exception {
        AddressBook addressBook=new AddressBook();
        addressBook.loaddata();
    }

}
