

package datingapp2;

import java.io.IOException;
import java.util.Scanner;


public class DatingApp2 {

   
    public static void main(String[] args) throws IOException {
               
inputMethod.readFile();

methods.printAllfirstnames();


Scanner scan = new Scanner(System.in);

        System.out.println("What sort of personality are you looking for? sleepy, outgoing or reserved? ");
        
        String answerPers = scan.nextLine();
        
        
        System.out.println("What sort of personality are you looking for? sleepy, outgoing or reserved? ");
        
        String answerPers2 = scan.nextLine();
        
        System.out.println("What sort of interests are you looking for? sports, reading or music? ");
        
        String answerInts = scan.nextLine();
        
        methods.matchPandI(answerPers2,answerInts);
    }

}
