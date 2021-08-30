package services;

import java.util.Random;


import model.Employee;

public class CredentailServices {
	
	public Employee employee ;
	
	public String department;
	
	public CredentailServices(Employee employee, String department) {
		this.employee = employee;
		this.department = department;
	}
  
    public String generateEmail(){
        return employee.getFirstName()+employee.getLastName()+"."+department.toLowerCase()+"@abc.com";
    }

    private static char[] generatePassword(int length) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[length];
  
        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));
     
        for(int i = 4; i< length ; i++) {
           password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
     }

    public void showCredentials(){
    	System.out.println("Email -->"+ generateEmail());
    	System.out.println("Password -->"+ generatePassword(8));
    }
 
  

}
