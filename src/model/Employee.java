package model;


public class Employee {
    String fName;
    String lName;
    String emailId;
    String Password;
 

   public Employee(String fName, String lName){
       this.fName = fName;
       this.lName = lName;
   }

   public String getFirstName(){
       return fName;
   }

   public void setfName(String fName){
        this.fName = fName;
   }

   public String getLastName(){
        return lName;
   }

    public void setlName(String lName){
        this.lName = lName;
    }

    public String getEmailId(){
        return emailId;
   }

    public void setlEmailId(String emailId){
        this.emailId = emailId;
    }

    public Employee(){

    }
 

}