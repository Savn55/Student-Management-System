package studentDatabaseApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private ArrayList<String> courses = new ArrayList<String>();
	private int tuitionBalance;
	private static int coursePrice=600;
	private static int id = 1000;
	
	// constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter Last Name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1. Freshmen\n2. Sophmore\n3. Juior\n4. Senior\nEnter Grade Year: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		System.out.println(firstName + " " + lastName + " " +"ID: "+ studentID);
		
		
	}
	
	// Generate an ID
	private void setStudentID() {
		// studentID = gradeYear + ID 
		id++; // update id for each newly added student
		this.studentID = gradeYear + "" + id;
		
	}
	
	// Enroll in courses
	public void enroll() {
		while (true){
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			
			if (!course.equals("Q")) {
				courses.add(course);
				tuitionBalance = tuitionBalance + coursePrice;
				
			}
			else {break;}
			
		}
	
	}
	
	public void viewBalance() {
		System.out.println("Your balance: $" + tuitionBalance);
	}
	
	public void displayCourses() {
		System.out.println("Enrolled IN : ");
		for (int i=0; i<courses.size();i++) {
			System.out.println("   " + courses.get(i));
		}
	}
	
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for the payment of $" + payment);
		viewBalance();
	}
		
	public void showInfo() {
		System.out.println();
		System.out.println("#####################");
		System.out.println("Student Informations");
		System.out.println("Name: " + firstName + " " + lastName); 
		displayCourses();
		System.out.println("\nBalance: $" + tuitionBalance);
		
				
	}
	
	
	
}
