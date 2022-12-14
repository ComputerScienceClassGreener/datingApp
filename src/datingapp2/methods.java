
package datingapp2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class methods {
    
   static ArrayList<regUser> usersArray = new ArrayList<regUser>(); // Create an ArrayList (this is dynamic) that will store instances of regUser class 
    
    
    public static void register() throws IOException{
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your firstname?");
        
        String fn = scan.nextLine();
        
        System.out.println("What is your lastname?");
        
        String ln = scan.nextLine();
        
               
         System.out.println("What is your age?");
         
         int age = scan.nextInt();
         // consumes the next line
         scan.nextLine();
                 
         System.out.println("What is your email?");
        
        String em = scan.nextLine();
        
        System.out.println("Type in a password?");
        
        String pw = scan.nextLine();
        
        System.out.println("What is your haircolour? please choose either: black, brown, blonde, blue, green, red, purple");
        
        String hc = scan.nextLine();
        
        System.out.println("What is your personality? Please choose either: outgoing, sleepy, or reserved ");
        
        String pe = scan.nextLine();
        
        System.out.println("What is your interests? Please choose either: sports, music, or reading");
        
        String in = scan.nextLine();
        
        regUser newUser = new regUser(fn, ln, age,em,pw,hc,pe,in);
                
                

        // calls the static method output that will send the new User objects data to a text file
        outputMethods.outputUsers(newUser);
        
        
        
        //usersArray.add(newUser); //adds the newUser object to the arraylist
                
        
    }
    
    
    public static void printData(regUser Object){
        
        System.out.println("The details of the user are:");
        System.out.println("Firstname = "+Object.getFirstName());
        System.out.println("Lastname = "+Object.getLastName());
        System.out.println("Your age = "+Object.getAge());
        System.out.println("Email = "+Object.getEmail());
        System.out.println("Your password = "+Object.getPassword());
        System.out.println("Your haircolour = "+Object.getHaircolour());
        System.out.println("Your personality = "+Object.getPersonality());
        System.out.println("Your interests = "+Object.getInterests());
                
                
    }
    
    public static void printIndexData( int index){
      
        // This will output the firstname of the index requested
        System.out.println(usersArray.get(index).getFirstName());
     
        
    }
    
    
    // this method loops through the users Arraylist and prints out the firstnames of all the obejcts in each index
    public static void printAllfirstnames(){
        
        for (int x = 0;x<usersArray.size();x++){
        
            System.out.println(usersArray.get(x).getFirstName());
        
    }
  
    }
    // this method allows a user to repeat the register method until the user does not want to
    public static void keepAddingUsers() throws IOException{
        
        Scanner question = new Scanner(System.in);
        boolean keepAdding = true;
        
        register();
        
        while (keepAdding==true){
            
                 
            System.out.println("Do you want to add more users? type y for Yes or n for No");
            
            String answer = question.nextLine();
            
            
            if (answer.equals("y")){
                
                register();
            }
            else{
                
                keepAdding = false;
            }
            
        }
        
//        System.out.println("Give me a name to search for");
//        // use the question scanner to store the name the user is looking for and pass it to the search method
//        String reply = question.nextLine();
//        
//        searchName2(reply);
        
    }
    
    
    // this method will search the arraylist for a name you give it
    public static void searchName2(String Name){
        //flag that changes to true if the name is found in the arraylist
        boolean found = false;
        int indexFoundAt =0;
        // loops through the arraylist
       for (int x = 0;x<usersArray.size();x++){
           //checks to see if each index contains the name you are looking for
           if (Name.equals(usersArray.get(x).getFirstName())){
               
               found = true;
               // stores the index number where the name was found
               indexFoundAt=x;
           }
       }
       if (found ==true){
           System.out.println("Clients data is found and is below:");
        System.out.println(usersArray.get(indexFoundAt).getFirstName());
        System.out.println(usersArray.get(indexFoundAt).getLastName());
        System.out.println(usersArray.get(indexFoundAt).getAge());
       }
       else{
           System.out.println("Client is not here");
       }
    }
    
    
    //need to cover I/O first before we do this 8/12
    
//    public static String rangeQuestion(){
//        
//        Scanner range = new Scanner(System.in);
//        
//        System.out.println("What range of age would you like to date? A = 20-40, B = 40-60, C = 60 and above");
//        
//        String rangeResult = range.nextLine();
//        
//        return rangeResult;       
//    }
//    
//    public static void ageSearch(String range){
//        
//        if(range=="C"){
//            for(int x = 0; x<usersArray.size();x++){
//                
//                if (usersArray.get(x).getAge()>59){
//                
//            }
//                
//            }
//        }
//        
//        
//    }
    
    
}
