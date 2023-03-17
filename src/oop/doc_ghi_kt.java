package oop;


import static java.awt.PageAttributes.MediaType.D;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pixel
 */
public class doc_ghi_kt {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File f=new File("D:\\file_kt.txt");
        PrintWriter p=new PrintWriter(f);
        p.println("Hello");
        p.println("i'm fine");
        p.close();
        FileReader fr= new FileReader("D:\\file_kt.txt");
        BufferedReader br=new BufferedReader(fr);
        System.out.println("Doc tu file"+ br.readLine());
        br.close();
    }
}
