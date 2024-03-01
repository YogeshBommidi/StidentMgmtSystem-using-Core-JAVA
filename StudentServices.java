import java.util.Scanner;
class StudentServices {
	long id = 322228801;
	Student studentList[] = new Student[10];
	Scanner scan = new Scanner(System.in);
	int idx = 0;
	void addNewStudent() {
		if(idx <10) {
			Student std = new Student();
			std.studentId = id;
			
			System.out.println("Enter Student Name:");
			String Name = scan.nextLine();
			std.studentName = Name;
						
			System.out.println("Enter Student Age:");
			int age = scan.nextInt();
			std.studentAge = age;
			scan.nextLine();

			System.out.println("Enter Student Gender:");
			String gen = scan.nextLine();
			std.Gender = gen;
			
			
			System.out.println("Enter Opted Course:");
			String OC = scan.nextLine();
			std.OptedCourses = OC;
			
			System.out.println("Enter Student Qualification:");
			String qual = scan.nextLine();
			std.Qualification = qual;
			
			System.out.println("Enter Student E-Mail ID:");
			String email = scan.nextLine();
			std.EmailId = email;
			
			System.out.println("Enter Student Phone Number:");
			long ph = scan.nextLong();
			std.PhoneNO = ph;
			
			studentList[idx] = std;
			id++;
			idx++;
		}
		else {
			System.out.println("Sorry!!! Student Database is Empty");
		}
	}
	
	void displayStudentDetails() {
		if(idx > 0) {
			for(int i = 0;i < idx; i++) {
				studentList[i].displayStudentsDetails();
			}
		}
		else {
			System.out.println("Sorry!!! There isno Data Available");
		}
	}
	
	void menu() {
		while(true) {
			System.out.println("==================================Student Managment==========================================");
			System.out.println("Enter 1 to add new student details");
			System.out.println("Enter 2 to display student details");
			System.out.println("Enter 9 to Exit");
			System.out.println("Enter your Choice");
			
			int ch = scan.nextInt();
			scan.nextLine();
			switch(ch) {
			case 1 : addNewStudent();break;
			case 2 : displayStudentDetails();break;
			case 9 : System.exit(0);
			default : System.out.println("Project Under Development");
			}
		}
	}
}
