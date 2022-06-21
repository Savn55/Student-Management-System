package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {

		System.out.print("Enter number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudent = in.nextInt();
		Student[] students = new Student[numOfStudent];
		
		for (int n=0; n<numOfStudent; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			students[n].showInfo();
			System.out.println();
			System.out.println("------------------------");
		}
	
	}

}
