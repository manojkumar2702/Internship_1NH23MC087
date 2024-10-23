package com.tripillar.filehandling.text;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args){
        File myfile = new File("example.txt");

        try {
            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
