/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Pixel
 */
public class TryCatchFinally {
    public void Doc() throws IOException{
        InputStreamReader reader = new InputStreamReader(System.in); 
        BufferedReader buf;
        buf = new BufferedReader(reader);
        try{				
            String str = buf.readLine();
            int num = Integer.valueOf(str).intValue(); 	       
        } 
        catch (IOException e) { 
            System.err.println("IO Exception");
        }
        catch (NumberFormatException e) {
            System.err.println("NumberFormatException");
        }
        catch(Exception e) {
            System.err.println(e.getMessage());
        }
        finally {
            buf.close();
        }   
    }
}
