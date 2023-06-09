package Enhance;

import java.util.Scanner;
//import java.util.LocalDate;

public class Educator {

	public int EducatorId;
	public String EducatorName;
	public String address;
	public String Email;
	public String Experience;

	public void setEducatorId(int EducatorId) {
		this.EducatorId = EducatorId;
	}

	public int getEducatorId() {
		return EducatorId;
	}

	public void setEducatorName(String EducatorName) {
		this.EducatorName = EducatorName;

	}

	public String getEducatorName() {
		return EducatorName;

	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getadress() {
		return address;
	}

	public void setEmail(String Email) {
		this.Email = Email;

	}

	public String getEmail() {
		return Email;

	}

	public void setExperience(String Experience) {
		this.Experience = Experience;

	}

	public String setExperience() {
		return Experience;

	}

	// Function to display Educator's detail
	public void display() {
		System.out.println("Educator Name: " + EducatorName);
		System.out.println("Educator's ID:" + EducatorId);
		System.out.println("Email:" + Email);
		System.out.println("Address" + address);
		System.out.println("Experience" + Experience);
	}

	public static void main(String args[]) {

	}

}