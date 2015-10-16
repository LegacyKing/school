
package ageverificationv2;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Program: AgeVerification 
 * Description: This class is used to verify a user is a given age using a very basic method of comparing the 
 *              entered age against the required age (set to 21 currently as a constant value).
 * Date: 09/23/2015
 * @author Andrew Maitland
 */
public class AgeVerificationv2 {

    public static final int RequiredAge = 21;   // Constant to allow ease of changing this in the future
          
    /**
     * @param args the command line arguments
     */
        
    
    public static void main(String[] args){
    
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("person.txt"));
        } catch (IOException ex) {
            Logger.getLogger(AgeVerificationv2.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        
        // Declarations
        String finished = null;
       List<Person> allPeople = new ArrayList<>();
       
      
       while (!"y".equals(finished)){
        // run loop
         Person myPerson = new Person(); // create a new person object, in theory a new object is created each loop
        
        int userAge = myPerson.getAge();
        String userName = myPerson.getUserName();
        String userAddress = myPerson.getAddress();
        String userPhoneNumber = myPerson.getPhoneNumber();
        
        if (userAge < RequiredAge){                                       // loop,
           // we do nothing if not the required age or older.
        }
        else {
           
            allPeople.add(myPerson);    // Add myPerson to the arraylist, not reading back, just storing.
              // write the info to the file
            try {
                bw.write("Name is: " + userName + ", Age is: " + userAge + ", Address is: " + userAddress + ", Phone Number: " + userPhoneNumber);
                bw.write("\n");
                
             } catch (IOException ex) {
                 Logger.getLogger(AgeVerificationv2.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        finished = getUserInput("Are you finished? (y/n): "); 
        } // endwhile, we read and output from the file.
        try { 
            bw.close(); // Close the file as we no longer need it.
        } catch (IOException ex) {
            Logger.getLogger(AgeVerificationv2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       readfile rf = new readfile();    // create an object to read our file.
        
        rf.openFile();  // Open the file
        rf.readFile();  // Read the contents of the file
        rf.closeFile(); // Close the file after we are done.
        
        
   } // close method

   
     /**
     *      userVerification displays the final message to the end user whether they
     *      cannot play, or can play. Also displays the values entered by the user.
     * 
     * @param prompt the command line arguments
     * @return inputLine
     */
   
   public static String getUserInput(String prompt){
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0 ) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
    }
        return inputLine;
    }
}    // close class
