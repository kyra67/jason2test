package jackson.two.test;

public class User {
	
	private String name;
	private int year;
	private String describe;
	
	public User() {
		super();
	}
	
	public User(String name, int year, String describe) {
		super();
		this.name = name;
		this.year = year;
		this.describe = describe;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getDescribe() {
		return describe;
	}
	
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	
	@Override
	public String toString() {
		return "User [name = " + name + ", year =  " + year + ", describe = " + describe + "]";
	}

}
