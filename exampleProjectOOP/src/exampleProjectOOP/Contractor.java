package exampleProjectOOP;

public class Contractor extends Employee {

	private String agency;
	private float hourlyRate;
	
	public Contractor(int id, String name, String lastName, String email, int age, String jobTitle, String agency, float hourlyRate) {
		super(id, name, lastName, email, age, jobTitle);
		this.agency = agency;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%sAgency: %s\nHourly Rate: %f\n", super.toString(), agency, hourlyRate);
	}
	
	@Override
	float getAnnualSalary() {
		// TODO Auto-generated method stub
		return hourlyRate * 8 * 20 * 12; //8hs * 20d * 12m
	}


	

}
