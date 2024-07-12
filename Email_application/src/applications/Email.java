package applications;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private int mailCapacity;
	private String alternateEmail;
	private String changePassword;
	private String companySuffix = "kpr.ac.in";
	private String email;
	
	public  Email(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println(this.firstName+this.lastName);
		
		// call the method of Department
		this.department = setdepartment();
		System.out.println("Department :" +this.department);
		
		//call the method of password
		this.password = setrandeomPassword(10);
		System.out.println("Your Password is :"+this.password);
		
		//Combine the email
		email =firstName.toLowerCase()+lastName.toLowerCase()+department+"@"+companySuffix;
		System.out.println("Your Email is :" +email);
		
		}
	
	
	
	//Choose the department
	public String setdepartment() {
		System.out.println("Department :\n1 for Sales \n2 fro development \n3 for Accouonts \n0 for none \nEnter the department :");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice == 1) {
			return"Sales";
		}
		else if(choice == 2) {
			return "development";
			
		}
		else if(choice == 3) {
			return "Accounts";
		}
		else {
			return "";
		}
	
	}
	// Generate the Random password
	public String setrandeomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*";
		char[] password = new char[length];
		for(int i = 0;i<length;i++) {
			int rand = (int)(Math.random()*passwordSet.length());
			password[i]= passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	
	//Set Mail capacity
	public void setmailCapacity(int capacity) {
		this.mailCapacity = capacity;
	}
	//set Alternate mail
	public void setalterMail(String alter) {
		this.alternateEmail = alter;
	}
	//Set Change  Password
	public void setchangePassword(String password) {
		this.changePassword = password;
	}
	
	public int getmailboxCapacity(){
		return mailCapacity;
	}
	public String getAltermail() {
		return alternateEmail;
		
	}
	public String getchangePassword() {
		return changePassword;
	}

}



