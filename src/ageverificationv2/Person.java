/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageverificationv2;

import static ageverificationv2.AgeVerificationv2.getUserInput;

/**
 *
 * @author Andrew Maitland
 */
public class Person implements Input {
    String userName;
    int userAge;
    String userAddress;
    String userPhoneNumber;

    
    @Override
    public String getUserName(){
       userName = getUserInput("Enter your name: ");  
       return userName;
    }   

    @Override
    public int getAge(){
        String enteredAge = getUserInput("Enter Age in Years: ");
        userAge = Integer.parseInt(enteredAge);     // Convert the Age String to a usable number
        if (userAge <=0 || userAge >= 116){         // validate proper age
            return 1;
        } else {
            return userAge;
        }
    }
      
    @Override
    public String getAddress(){
       userAddress = getUserInput("Enter your address: "); 
       return userAddress;
    }
    
    @Override
    public String getPhoneNumber(){
       userPhoneNumber = getUserInput("Enter your telephone number: ");  
       return userPhoneNumber;
    }

}
