package homework2;

public class Main {

	public static void main(String[] args) {
		
		
		
		Student student =new Student();
		student.id=1;
		student.password="12345";
		student.userName="elifkartal";
		
		Instructor instructor=new Instructor();
		instructor.id=1;
		instructor.password="67890";
		instructor.firstName="Engin";
		instructor.lastName="Demiroğ";
		instructor.courseName="JAVA";
		
		UserManager user=new UserManager();
		user.add();
		System.out.println("-------------");
		
		InstructorManager ınstructor =new InstructorManager();
		ınstructor.add();
		System.out.println("-------------");
		
		
		StudentManager students =new StudentManager();
		students.add();
		
		
		
		
		
		
		
		
		
	}

}

