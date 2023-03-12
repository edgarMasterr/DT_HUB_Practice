package student.com;

public class Student {

	
	public int rollNo;
	public int age;
	
	public void wellcomeMessage() {
		System.out.println("Welcome to all of you");
	}
	
	public void automationMessage() {
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student iAmStudent = new Student();
		
		iAmStudent.rollNo = 20;
		iAmStudent.age =17;
		
		System.out.println(iAmStudent.rollNo);
		System.out.println(iAmStudent.age);
		iAmStudent.wellcomeMessage();
		iAmStudent.automationMessage();
	}
}
