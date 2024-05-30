package member;

public class Member {
	private String Name,Address,phonenumber;
	private double salary,age;
	
	public Member(String name, String address, String phonenumber, double salary, double age) {
		this.Name = name;
		this.Address = address;
		this.phonenumber = phonenumber;
		this.salary = salary;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [Name=" + Name + ", Address=" + Address + ", phonenumber=" + phonenumber + ", salary=" + salary
				+ ", age=" + age + "]";
	}
	
	

}
