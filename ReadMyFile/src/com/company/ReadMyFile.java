package com.company;
import java.io.FileNotFoundException;
import java.io.*;

/**
 * Created by SungWon on 8/4/2016.
 */
public class ReadMyFile {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileReader reader =  new FileReader("data.txt");
        char [] data = new char[50];
        reader.read(data);
        for (int i = 0; i < data.length ; i++) {
            System.out.print(data[i]);
        }
        reader.close();
    }
}
