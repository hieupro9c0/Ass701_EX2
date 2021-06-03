package Controller;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {
	Scanner sc = new Scanner(System.in);
	
	 public int getValidInt(int min, int max) {
	        while (true) {
	            try {
	                int temp = Integer.parseInt(sc.nextLine());
	                if (temp < min || temp > max) {
	                    throw new Exception();
	                }
	                return temp;
	            } catch (Exception e) {
	                System.out.println("Wrong format");
	                System.out.println("Please enter again");
	            }
	        }
	    }
	
	public String checkPhone(String phone) {
		Pattern patternPhone = Pattern.compile("\\d{10}");
		 for (char ch : phone.toCharArray()) {
			 if (Character.isAlphabetic(ch)){
				 System.out.println("Phone number must is number");
				 System.out.println("Enter phone:");
				 phone = sc.nextLine();
				 checkPhone(phone);
			 }
		 }
		 if(patternPhone.matcher(phone).matches()==true) {
			 return phone;
		 }
		 if(patternPhone.matcher(phone).matches()==false) {
			 System.out.println("Phone number must be 10 digits");
			 System.out.println("Enter phone:");
			 phone = sc.nextLine();
			 checkPhone(phone);
		 }
		 return phone;
	}
	
	public String checkEmail(String email) {
		Pattern patternEmail = Pattern.compile("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$");
		if(patternEmail.matcher(email).matches()==true) {
			return email;
		}
		if(patternEmail.matcher(email).matches()==false) {
			System.out.println("Email must is correct format");
			System.out.println("Enter email:");
			email = sc.nextLine();
			checkEmail(email);
		}
		return email;
	}
	
	public String checkDate(String date) {
		Pattern patternDate = Pattern.compile("^\\d{1,2}[/]\\d{1,2}[/]\\d{4}$");
		if(patternDate.matcher(date).matches()==true) {
			return date;
		}
		if(patternDate.matcher(date).matches()==false) {
			System.out.println("Date to correct format(dd/mm/yyyy)");
			System.out.println("Enter Birth Date:");
			date = sc.nextLine();
			checkDate(date);
		}
		return date;
	}
}
