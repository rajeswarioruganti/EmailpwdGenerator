package com.aikyatech.driver;
import com.aikyatech.model.Employee;
import com.aikyatech.service.EmailGen; 
import java.util.Scanner;

public class EmpDriver {
	public static void main(String[]args)
			{
		Employee emp1= new Employee("rajeswari","oruganti");
		EmailGen egen =new EmailGen();		
		String deptName =retrieveDeptName();
		String email = egen.generateEmail(emp1.getFirstname(),emp1.getLastname(), deptName);
		char[] password=egen.generatePassword();
		egen.displayInfo(emp1.getFirstname(), email, password);
			}

	private static  String retrieveDeptName()
	{
		System.out.println("Please enter the department ID:");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.HumanResource");
		System.out.println("4.Legal");
		Scanner sc=new Scanner(System.in);
		int userChoice = sc.nextInt();
		String domainName;
		if(userChoice==1)
		{
			domainName = "Technical";
		}else if (userChoice==2)
		{
			domainName= "admin";
		}else if (userChoice==3)
		{
			domainName= "hr";
		}else
		{
			domainName= "legal";
		}
		sc.close();
		return domainName;
		
	}

}
