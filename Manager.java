package member;

public class Manager extends Employee{
	
	private String depertment;

public Manager(String name, String address, String phonenumber, double salary, double age, String depertment) {
		super(name, address, phonenumber, salary, age,depertment);
		this.depertment = depertment;
	}
	@Override
	public String toString() {
		return "Manager [depertment=" + depertment + "]";
	}





	

}
