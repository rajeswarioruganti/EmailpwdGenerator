package com.aikyatech.service;

import java.util.Random;

public class EmailGen {

	//email template: firstnamelastname@dept.aikyatech.com
	/**returns email id based on firstname,lastname and deptname
	 * @param - firstname
	 * @param - lastname
	 * @param -dept
	 * @return -email id based on dept 
	 * 
	 */
	
	public String generateEmail(String firstname,String lastname,String deptname)
	{
		
		String email;
		email =firstname + lastname + "@" +deptname + ".aikyatech.com";
		
		return email;
	}
	//Generate password
	/**
	 * @return - returns randomly generated password with array of chars
	 */
	public char[] generatePassword()
	{
		String allowedPwdChars = new String("abcdefghijklmnopqrstuvwxyz+_%$1234567890");
		int length=10;
		Random random =new Random();
		
		char[] password = new char[length];
		for (int i=0;i<length;i++)
		{
			int randomIndex = random.nextInt(allowedPwdChars.length());
			password[i]=allowedPwdChars.charAt(randomIndex);
		}
		return password;	
		
	}
	public void displayInfo(String firstname,String email,char[] password)
	/**
	 * display the message : dear name.. your generated credentials are as follows
	 * email and password
	 */
	{
	System.out.println("Dear  "  +  firstname +  "  your generated creditionals are as follows:");
	System.out.println("Your email id is: "   +email);
	System.out.println("Your password is: "   +new String(password));	
	}
}
