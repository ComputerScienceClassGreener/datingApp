package datingapp2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class inputMethod {


    public static void readFile() throws FileNotFoundException{
        
      File f = new File("/Users/harvhead/NetBeansProjects/datingApp2/src/datingapp2/users2.txt");    
    
        Scanner sc = new Scanner(f);

         // reading each line of text and placing the 1st 2nd 3rd 4th 5th 6th 7th and 8th element into different String Arraylist 
            while (sc.hasNextLine()) {
                // while there is a next line in the text file the scanner will place each line into a String
                String line = sc.nextLine();
                // the below code splits the String by a comma and each section is adding to a the index of a String array
                String[] details = line.split(",");
                // placing the contents of each index into its own variable
                String  firstname = details[0];
                String  lastname = details[1];
                String  age = details[2];
                String  email = details[3];
                String  password = details[4];
                String  hair = details[5];
                String  pers = details[6];
                String  interests = details[7];
                

                int intAge = Integer.parseInt(age);
                
                regUser newUser = new regUser(firstname, lastname, intAge,email,password,hair,pers,interests);
                //add the regUser object to the usersArray 
                methods.usersArray.add(newUser);
                
                
    }
    
    }
}
