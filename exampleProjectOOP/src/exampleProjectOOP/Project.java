package exampleProjectOOP;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Project {

	private String name;
	private List<Employee> employeesList;
	
	public List<Employee> getEmployeesList() {
		return employeesList;
	}
	
	public void printProjectMembers() {
		System.out.println("\nProject name: "+ name);
		if(!employeesList.isEmpty()) {
			employeesList.forEach(employee -> { System.out.println(employee.toString() + "Annual Salary: " + employee.getAnnualSalary() + "\n");});
		}
		else {
			System.out.println("Project doesn't have any members yet");
		}
	}
	
	public float getProjectAnnualBudget() {
		float annualBudget = 0;
		Iterator<Employee> i = employeesList.iterator();
	    while (i.hasNext()) {
	    	annualBudget += i.next().getAnnualSalary();
	    }
	    return annualBudget;
	}
		
	public void assignEmployees(List<Employee> employeesList) {
		this.employeesList = employeesList;
	}
	
	public Project(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

}
