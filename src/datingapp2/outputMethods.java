package datingapp2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class outputMethods {
    
    // this method will send our data to a text file. The exception is added because we need to tell the compiler that it has to access something outside of the package
    // and it is going to be ok
    public static void outputUsers(regUser Object) throws IOException{
        // this makes it possible to put the data into a format from java to a file
        BufferedWriter output;
        // this makes an object ready to send to a file
        output = new BufferedWriter(new FileWriter("/Users/harvhead/NetBeansProjects/datingApp2/src/datingapp2/users2.txt", true));
         // adds the objects variables to the txt file
        output.append(Object.getFirstName() + "," + Object.getLastName()+ "," + Object.getEmail() + ","+ Object.getAge());
        // adds a new line on the text file
        output.newLine();
        // needs to be closed otherwise the next line of text will overwrite the last line of text
        output.close();
    }
    
    
}
