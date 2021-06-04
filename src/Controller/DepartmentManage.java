package Controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Department;
import model.HourlyEmployee;
import model.SalariedEmployee;

public class DepartmentManage {
	Scanner sc = new Scanner(System.in);
	Validation v = new Validation();
	Department d = new Department();
	ArrayList<SalariedEmployee> listOfSalaryEmployee = new ArrayList<>();
	ArrayList<HourlyEmployee> listOfHourlyEmployee = new ArrayList<>();
	SalariedEmployee se = new SalariedEmployee();
	HourlyEmployee he = new HourlyEmployee();
	
	public void addEmployee() {
		System.out.println("Do You Want To Add SalaryEmployee(1) or HourlyEmployee(2)?:");
		int x = v.getValidInt(1, 2);
//		ArrayList<SalariedEmployee> listOfSalaryEmployee = new ArrayList<>();
//		ArrayList<HourlyEmployee> listOfHourlyEmployee = new ArrayList<>();
//		SalariedEmployee se = new SalariedEmployee();
//		HourlyEmployee he = new HourlyEmployee();
		System.out.println("Enter SNN: ");
		String ssn = sc.nextLine();
		System.out.println("Enter FirstName: ");
		String firstName = sc.nextLine();
		System.out.println("Enter LastName: ");
		String lastName = sc.nextLine();
		System.out.println("Enter BirthDate: ");
		String birthDate = sc.nextLine();
		v.checkDate(birthDate);
		System.out.println("Enter Phone: ");
		String phone = sc.nextLine();
		v.checkPhone(phone);
		System.out.println("Enter Email: ");
		String email = sc.nextLine();
		v.checkEmail(email);
		if(x==1) {
			se.setSsn(ssn);
			se.setFirstName(firstName);
			se.setLastName(lastName);
			se.setBirthDate(birthDate);
			se.setPhone(phone);
			se.setEmail(email);
			System.out.println("Enter Commission Rate: ");
			double commissionRate = sc.nextDouble();
			se.setCommissionRate(commissionRate);
			System.out.println("Enter Gross Salary: ");
			double grossSalary = sc.nextDouble();
			se.setGrossSalary(grossSalary);
			System.out.println("Enter Basic Salary: ");
			double basicSalary = sc.nextDouble();
			se.setBasicSalary(basicSalary);
			listOfSalaryEmployee.add(se);
			System.out.println("Add Employee Successful!");
		}
		else if(x==2) {
			he.setSsn(ssn);
			he.setFirstName(firstName);
			he.setLastName(lastName);
			he.setBirthDate(birthDate);
			he.setPhone(phone);
			he.setEmail(email);
			System.out.println("Enter Wage: ");
			double wage = sc.nextDouble();
			he.setWage(wage);
			System.out.println("Enter Working Hour: ");
			double workingHour = sc.nextDouble();
			he.setWorkingHours(workingHour);
			listOfHourlyEmployee.add(he);
			System.out.println("Add Employee Successful!");
		}	
	}
	
	public void displayEmployee() {
		for (int i = 0; i < listOfSalaryEmployee.size(); i++) {
            System.out.println(listOfSalaryEmployee.get(i));
        }
		for (int i = 0; i < listOfHourlyEmployee.size(); i++) {
            System.out.println(listOfHourlyEmployee.get(i));
        }
	}
}
