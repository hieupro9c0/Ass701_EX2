package UI;

import Controller.DepartmentManage;
import Controller.Validation;

public class main {
	public static void main(String[] args) {
		Validation v = new Validation();
		DepartmentManage d = new DepartmentManage();
		while(true) {
		int input = v.getValidInt(1, 2);
		switch(input) {
		case 1:
			d.addEmployee();
			break;
		case 2:
			d.listDepartment();
			break;
		}
		
	}
}
}
