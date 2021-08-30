package driver;

import java.util.Scanner;

import model.Employee;
import services.CredentailServices;


public class Driver {
 
  static Scanner ab = new Scanner(System.in);
 public static void main(String args[]){
  
  String dep ="",fName, lName;
    
  System.out.println("Enter your first name");
  fName = ab.nextLine();
  
  System.out.println("Enter your last name");
  lName=ab.nextLine();
  
  Employee employee= new Employee(fName,lName);

  System.out.println("Please enter the department from the following");
  System.out.println("1. Technical\n2. Admin\n3. Human resource\n4. Legal");
  int option = Integer.parseInt(ab.nextLine());
  
  switch(option){
  case 1:
    dep = "Technical";
   break;
  case 2:
    dep = "Admin";
   break;
  case 3:
    dep = "Human resource";
   break;
  case 4:
    dep = "Legal";
   break;
  default:
   break;
  }
 
  
  CredentailServices services = new CredentailServices(employee, dep);
  System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
  
  services.showCredentials();
 }


}
