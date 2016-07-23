package com.jpmorgan.example;

import java.util.Iterator;
import java.util.List;

public class DepartmentSalaryCount {

	List<Employee> employees;
	
	public int countDepartmentSalary(List<Employee> employees,int headId){
		this.employees = employees;
		return departmentSalaryCount(headId, 0, true);
	}
	
	private int departmentSalaryCount(int headId,int previousSalaryCount,boolean isFirstTime){		
		Iterator<Employee> iterator = employees.iterator();		
		while(iterator.hasNext()){
			Employee employee = iterator.next();
			if(employee.getManagerId()== headId ){
				previousSalaryCount+= employee.getSalary();
				previousSalaryCount = departmentSalaryCount(employee.getId(), previousSalaryCount,false);
			}
		}		
		return previousSalaryCount;
	}
}
