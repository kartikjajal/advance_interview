package com.jpmorgan.example;

public class Employee {

	int salary;
	int id;
	int managerId;
	
	

	public Employee(int salary, int id, int managerId) {
		super();
		this.salary = salary;
		this.id = id;
		this.managerId = managerId;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", id=" + id + ", managerId="
				+ managerId + "]";
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

}
