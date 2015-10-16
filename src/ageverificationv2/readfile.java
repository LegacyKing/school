/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageverificationv2;

import java.io.*;
import java.util.*;

/**
 *
 * @author Andrew Maitland
 */
public class readfile {

    private Scanner x;
    
    public void openFile(){
        try{
            x = new Scanner(new File("person.txt"));
        }
        catch(Exception e){
            System.out.println("could not find file");
        }
    }
    
    public void readFile(){
        while(x.hasNext()){
            String a = x.next();
            String b = x.next();
            String c = x.next();
            String d = x.next();
            
            System.out.printf("%s %s %s %s \n", a, b, c, d);
        }
    }
    
    public void closeFile(){
        x.close();
    }
}

/**
 * try{
        Scanner input = new Scanner(file);
        String userName = input.nextLine();
        int userAge = input.nextInt();
        String userAddress = input.nextLine();
        String userPhoneNumber = input.nextLine();
        } catch (FileNotFoundException e) {
            System.out.printf("Error: %s\n", e);
        }
 */