package model;

public class SalariedEmployee extends Employee{
	private double commissionRate;
	private double grossSalary;
	private double basicSalary;
	
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
}
