package com.tripillar.filehandling.text;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
    public static void main(String[] args) {
        String fileName = "example.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello, this is a sample text.");
            System.out.println("Text file written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


