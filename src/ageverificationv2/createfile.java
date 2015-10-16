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
public class createfile {

        public File writefile(File file){
            try{
                FileWriter writer = new FileWriter("J:\\test.txt");
            }
            catch(IOException e) {
                System.out.println("IOException: " + e);
            }   
        return file;
        }
}
