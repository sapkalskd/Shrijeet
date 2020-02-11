package com.nt.bo;

public class EmployeeBO {
	private int empId;
	private String empName;
	private String desg;
	private double salary;
	
	//Constructor
	public EmployeeBO() {

		System.out.println("EmployeeBO.EmployeeBO()-0-param constructor");
	}

	//setters and getters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeBO [empId=" + empId + ", empName=" + empName + ", desg=" + desg + ", salary=" + salary + "]";
	}
	
}//class
