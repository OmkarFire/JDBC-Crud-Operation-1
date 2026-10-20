package in.sp.main.entity;

public class Student
{
	private String name;
	private String city;
	private String marks;
	
	public Student()
	{
		
	}
	
	public Student(String name, String city, String marks) {
		
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	

}
