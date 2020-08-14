package exampleProjectOOP;

public class StaffEmployee extends Employee {

	private float baseSalary; //salario mensual
	private float annualBonus;
	

	public StaffEmployee(int id, String name, String lastName, String email, int age, String jobTitle, float baseSalary,
			float annualBonus) {
		super(id, name, lastName, email, age, jobTitle);
		this.baseSalary = baseSalary;
		this.annualBonus = annualBonus;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%sBase salary: %f\nAnnual bonus: %f\n", super.toString(), baseSalary, annualBonus);
	}

	@Override
	float getAnnualSalary() {
		// TODO Auto-generated method stub
		return 12 * baseSalary + annualBonus;
	}

}
