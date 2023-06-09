package Enhance;

//import java.util.Calendar;

public class Student {
	public int StudentId;
	public String StudentName;
	public String DOB;
	public long S_mobile;
	public String S_email;
	public String S_address;

	public void setStudentId(int StudentId) {
		this.StudentId = StudentId;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentName(String StudentName) {
		this.StudentName = StudentName;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setDOB(String DOB) {
		this.DOB = DOB;
	}

	public String getDOB() {
		return DOB;
	}

	public void setS_Mobile(long S_mobile) {
		this.S_mobile = S_mobile;

	}

	public long getS_Mobile() {
		return S_mobile;
	}

	public void setS_email(String S_email) {
		this.S_email = S_email;
	}

	public String getS_email() {
		return S_email;
	}

	public void setS_address(String S_address) {
		// string S_address;
		this.S_address = S_address;
	}

	public String getS_address() {
		return S_address;
	}

	public void display() {
		System.out.println("Student's ID:" + StudentId);
		System.out.println("Student Name:" + StudentName);
		System.out.println("Student BirthDate:" + DOB);
		System.out.println("Studdent Mobile:" + S_mobile);
		System.out.println("Student Email" + S_email);
		System.out.println("Student address" + S_address);

	}

	public static void main(String args[]) {

	}
}