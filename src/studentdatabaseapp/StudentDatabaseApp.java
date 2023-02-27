package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
	public static void main(String[] args) {
		System.out.println("Enter the number of students to enroll: ");
		Scanner in =new Scanner(System.in);
		int numOfStudents=in.nextInt();
		Student[] students=new Student[numOfStudents];
		for(int n=0;n<numOfStudents;n++) {
			students[n]=new Student();
			students[n].enroll();
			students[n].payTuition(n);	
			
		}
		for(int n=0;n<numOfStudents;n++) {
			System.out.println(students[0].toString());
		}
		
		
	}

}
