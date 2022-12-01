
package datingapp2;


public class regUser {

    
    
    
    
private String firstName;

private String lastName;

private int age;

private String email;

private String password;

private String haircolour;

private String personality;

private String interests;


public regUser(String firstName, String lastName, int age, String email, String password, String haircolour, String personality, String interests ){
    
    this.firstName=firstName;
    this.lastName=lastName;
    this.age=age;
    this.email = email;
    this.password = password;
    this.haircolour = haircolour;
    this.personality = personality;
    this.interests = interests;
    
}



public String getFirstName() {
        return firstName;
    }

    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

   
    public String getLastName() {
        return lastName;
    }

  
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   
    public int getAge() {
        return age;
    }

  
    public void setAge(int age) {
        this.age = age;
    }

   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

   
    public String getHaircolour() {
        return haircolour;
    }

   
    public void setHaircolour(String haircolour) {
        this.haircolour = haircolour;
    }

    public String getPersonality() {
        return personality;
    }

    
    public void setPersonality(String personality) {
        this.personality = personality;
    }

   
    public String getInterests() {
        return interests;
    }

    
    public void setInterests(String interests) {
        this.interests = interests;
    }
    
    
    
}
