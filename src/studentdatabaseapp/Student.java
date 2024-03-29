package studentdatabaseapp;
import java.util.Scanner;
public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses="";
    private int tuitionBalance=0;
    private int costOfCourse=600;
    private static int id=1000;
    //constructor: prompt user to enter student's name and year
    public Student(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter student first name:");
        this.firstName=in.nextLine();

        System.out.println("Enter student last name:");
        this.lastName=in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level:");
        this.gradeYear=in.nextInt();
        setStudentID();
    }
    //Generate an id
    private void setStudentID(){
		//grade level + ID
        id++;
        this.studentID=gradeYear+ "" + id;

    }
    //enroll in courses
    public void enroll(){
    	do {
    		 System.out.println("Enter course to enroll (Q to quit): ");
    	        Scanner in=new Scanner(System.in);
    	        String course=in.nextLine();
    	        if(course.equals("Q")){
    	            courses=courses+ "\n   "+course;
    	            tuitionBalance=tuitionBalance+costOfCourse;
    	        }
    	        else {
    	        	
    	        	break;
    	        }
    	}while(1!=0);
    	
    }
    //view balance
    public void viewBalance() {
    	System.out.println("Your balance is: $"+ tuitionBalance);
    }
    // pay tuition
    public void payTuition(int payment) {
    	viewBalance();
    	System.out.println("Enter your payment: $");
    	Scanner in=new Scanner(System.in);
    	int payment1=in.nextInt();
    	tuitionBalance=tuitionBalance-payment1;
    	System.out.println("Thank you for your payment of $" +payment1);
    	viewBalance();  	
    }
    //show status
    public String toString() {
    	return "Name: "+firstName+ " "+lastName+
    			"\nGrade Level: "+gradeYear+
    			"\nStudent ID: "+studentID+
    			"\nCourses Enrolled:"+courses+
    			"\nBalance: $"+tuitionBalance;
    }
}



