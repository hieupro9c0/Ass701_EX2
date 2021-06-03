package model;

import java.util.ArrayList;

public class Department {
	private String departmentName;
	private ArrayList<Employee> listOfEmployee;
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public ArrayList<Employee> getListOfEmployee() {
		return listOfEmployee;
	}
	
	public void setListOfEmployee(ArrayList<Employee> listOfEmployee) {
		this.listOfEmployee = listOfEmployee;
	}
	
	public void display() {
		
	}
}
