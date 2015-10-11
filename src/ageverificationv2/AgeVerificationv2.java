
package ageverificationv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * Program: AgeVerification 
 * Description: This class is used to verify a user is a given age using a very basic method of comparing the 
 *              entered age against the required age (set to 21 currently as a constant value).
 * Date: 09/23/2015
 * @author Andrew Maitland
 */
public class AgeVerificationv2 {

    public static final int RequiredAge = 21;   // Constant to allow ease of changing this in the future
    
    // file f = new File("age_verification_data.txt");
    

    
    /**
     * @param args the command line arguments
     */
        
    
    public static void main(String[] args){
        // Declarations
        boolean ageVerified = false;    // set the value to false initially, this is for the While loop.
        String finished = null;
        // Set the userAge to 0
        int userAge = 0;
        
    
        while (!"Y".equals(finished)){
        // run loop
            userAge = userDetails();
            finished = getUserInput("Are all users entered? (y/n): "); 
        }
    while (ageVerified == false){  // Until the age meets the minimum requirement, continue to loop.
            if (userAge < RequiredAge){       
                    // calls the userDetails method and updates the userAge int value as well.
            } else {
                ageVerified = true;
                System.out.println("Enjoy your program");
                // load program
            }   // close if/else loop
      }  
    } // close method

    private static int userDetails(){             // method
        // Setting up arrays
        int personCount = 0;
        Person[] myPerson;
        personCount ++;
        myPerson = new Person[personCount];
        // Person myPerson = new Person(); // create a new person object, in theory a new object is created each loop
        
        int userAge = myPerson[personCount].getAge();
        String userName = myPerson[personCount].getUserName();
        String userAddress = myPerson[personCount].getAddress();
        String userPhoneNumber = myPerson[personCount].getPhoneNumber();
        
// each myPerson will obtain data
        //int userAge = myPerson.getAge();                    // Assign the int value from the object myPerson
        //String userName = myPerson.getUserName();           // assign value for userName
        //String userAddress = myPerson.getAddress();         // assign value for userAddress
        //String userPhoneNumber = myPerson.getPhoneNumber(); // assign value for userPhoneNumber
    
        // Input userAddress = Person.getAddress();
        // Input userPhoneNumber = Person.getPhoneNumber();
        
        
        userVerification(userAge, userName, userAddress, userPhoneNumber);      // Run the userVerification method
        
        return userAge; // return the userAge to update the value in main().
    }

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

    
    private static void userVerification(int userAge, String userName, String userAddress, String userPhoneNumber) {             // method
        if (userAge < RequiredAge){                                       // loop,
            // System.out.println("Sorry, you must be " + RequiredAge + " or older to play this game");
        }
        else {
            // need to save to a file to store
            
            System.out.println("Welcome " + userName);
            System.out.println("You are " + userAge);
            System.out.println("Entered Address is " + userAddress);
            System.out.println("Telephone number is " + userPhoneNumber);
        } // close ifelse
    }   // close method
}    // close class
