package com.bridgelabz.emailvalidator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailValidator {

	public static void main(String[] args) 
	{
		String emailId = "abc@bridgelabz.co.in";
		checkValidEmail(emailId);
		emailId = ".abc@abc.com";
		checkValidEmail(emailId);
		emailId = "_abc.@gmail.com";
		checkValidEmail(emailId);
		

	}
	public static void checkValidEmail(String email) 
	{
		String regexCheck= "^[a-zA-z]*[@][.a-zA-Z]*$";
		Pattern pattern = Pattern.compile(regexCheck);
		Matcher obj= pattern.matcher(email);
		if(obj.matches()==true)
		{
		System.out.println("THIS IS A VALID EMAIL");
			
		}
		else
			System.out.println("NOT A VALID EMAIL");
		
	}

}
