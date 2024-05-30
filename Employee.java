package member;

public class Employee extends Member {

	private String specialization;



	public Employee(String name, String address, String phonenumber, double salary, double age, String specialization) {
		super(name, address, phonenumber, salary, age);
		this.specialization = specialization;
	}

	public String toString() {
		return "Employee [specialization=" + specialization + "]";
	}
	
	 
}

	

