package com.jpmorgan.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class EmployeeSalaryCount {

	
	
	public static void main(String[] args) {
	
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee emp1 = new Employee(1250,1,-1);
		Employee emp2 = new Employee(1200,2,1);
		Employee emp3 = new Employee(900,3,1);
		Employee emp4 = new Employee(900,4,1);
		Employee emp5 = new Employee(800,5,2);
		Employee emp6 = new Employee(400,6,2);
		Employee emp7 = new Employee(400,7,2);
		Employee emp8 = new Employee(500,8,3);
		Employee emp9 = new Employee(550,9,4);
		Employee emp10 = new Employee(800,10,3);
		Employee emp11 = new Employee(300,11,8);
		Employee emp12 = new Employee(300,12,10);
		Employee emp13 = new Employee(300,13,10);
		Employee emp14 = new Employee(250,14,5);
		
/*		
		1,Akshat Joshi,0,1250
		2,ketul Patel,1,1200
		3,Bhushan Karia,1,900
		4,Dhaval Thakkar,1,900
		5,Nitin Balar,2,800
		6,Shyam vin,2,400
		7,Shirley Felix,2,400
		8,Tejas Shah,3,500
		9,Brijesh Mistry,4,550
		10,Vijay Ambaliya,3,800
		11,Kannan pillai,8,300
		12,Anand Patel,10,300
		13,Nishant Mishru,10,300
		14,Mihir purohit,5,250
*/

		EmployeeSalaryCount empSalCount = new EmployeeSalaryCount();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		employees.add(emp6);
		employees.add(emp7);
		employees.add(emp8);
		employees.add(emp9);
		employees.add(emp10);
		employees.add(emp11);
		employees.add(emp12);
		employees.add(emp13);
		employees.add(emp14);
		
		
		DepartmentSalaryCount departmentSalaryCount = new DepartmentSalaryCount();
		
		
		int deptSalaryCount = departmentSalaryCount.countDepartmentSalary(employees, 2);
		
		System.out.println(deptSalaryCount);
		
	}
	
}
