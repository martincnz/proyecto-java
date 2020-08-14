package exampleProjectOOP;

public abstract class Employee {

	private int id;
	private String name;
	private String lastName;
	private String email;
	private int age;
	private String jobTitle;
	
	abstract float getAnnualSalary();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Employee ID: %s\nName: %s\nLast name: %s\n", id, name, lastName);
	}
	
	public Employee(int id, String name, String lastName, String email, int age, String jobTitle) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
		this.jobTitle = jobTitle;
	}

}


