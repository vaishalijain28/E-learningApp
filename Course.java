package Enhance;

import java.util.*;

public class Course {
	Scanner sc;
	public int CourseId;
	public String CourseName;
	public String CourseType;
	public String c_Description;
	public int c_duration;

	public void setCourseId(int CourseId) {
		this.CourseId = CourseId;
	}

	public int getCourseId() {
		return CourseId;
	}

	public void setCourseName(String CourseName) {
		this.CourseName = CourseName;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseType(String CourseType) {
		this.CourseType = CourseType;
	}

	public String getCourseType() {
		return CourseType;
	}

	public void setc_Description(String c_Description) {
		this.c_Description = c_Description;
	}

	public String getc_Description() {
		return c_Description;
	}

	public void setc_duration(int c_duration) {
		this.c_duration = c_duration;
	}

	public int getc_duration() {
		return c_duration;
	}

	public void display() {
		System.out.println("Course Id:" + CourseId);
		System.out.println("Course Name:" + CourseName);
		System.out.println("Course Type:" + CourseType);
		System.out.println("Course Description:" + c_Description);
		System.out.println("Course Duration:" + c_duration);

	}

	public static void main(String args[]) {

	}

}