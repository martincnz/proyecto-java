package exampleProjectOOP;
import java.util.Arrays;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contractor contractor1 = new Contractor(1, "Pepito", "Gutierrez", "pepito.gutierrez@gmail.com", 45, "Sr Developer", "Globant Inc", 45);
		StaffEmployee staff1 = new StaffEmployee(2, "Papito", "Populo", "papito.populo@hotmail.com", 61, "Sales manager", 15000, 1000);
		Contractor contractor2 = new Contractor(3, "Juancito", "Rodriguez", "juancito.rodriguez@gmail.com", 43, "Sr Developer", "IBM", 45);
		StaffEmployee staff2 = new StaffEmployee(4, "Eduardo", "Gomez", "edu-gomez@hotmail.com", 65, "Manager", 17000, 5000);
		Contractor contractor3 = new Contractor(5, "Eduardo", "Gutierrez", "eduardo.gutierrez@gmail.com", 42, "Sr Developer", "Globant Inc", 45);
		StaffEmployee staff3 = new StaffEmployee(6, "Rodrigo", "Rodriguez", "rodriguez@ibm.com", 44, "Jr Developer", 18000, 3000);
		
		Project p1 = new Project("Proj1");
		Project p2 = new Project("Proj2");
		
		List<Employee> list1 = Arrays.asList(contractor1, staff1, contractor3, staff3);
		List<Employee> list2 = Arrays.asList(contractor2, staff2);
		
		p1.assignEmployees(list1);
		p2.assignEmployees(list2);
		
		p1.printProjectMembers();
		System.out.println("Project annual budget: " + p1.getProjectAnnualBudget());
		
		p2.printProjectMembers();
		System.out.println("Project annual budget: " + p2.getProjectAnnualBudget());
		
		/*projectTeam.forEach(employee -> {
		System.out.println(employee.toString() + "Salary: " + employee.getAnnualSalary());});
		*/
		



	}

}
