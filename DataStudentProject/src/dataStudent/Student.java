package dataStudent;

public class Student {
	int studentId;
	String name;
	String ssn; //Social Scurity Number
	double gpa; //Grade Point Average
	int schoolCode;
	
	public Student (int x, String n, String s, double g) {
		studentId = x;
		name = n;
		ssn = s;
		gpa = g;
	}
	public int getStudentId(){
		return studentId;
	}
	public void setStudentId(int studentId){
		this.studentId = studentId;
	}
	
	public String getName(String name){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getSSN(String ssn){
		return ssn;
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public double getGPA(double gpa) {
		return gpa;
	}
	
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	public String toString() {
		String s1 = "";
		s1 = "Student Id:" + getStudentId() +
				" Student Name:" + getName(name) +
				" Student SSN:" + getSSN(ssn) +
				" Student GPA:" + getGPA(gpa);
		return s1;
	}
}
