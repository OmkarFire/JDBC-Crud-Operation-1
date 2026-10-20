package in.sp.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.sp.main.dao.StudentDao;
import in.sp.main.entity.Student;

@SpringBootApplication
public class SpringBootProject5JdbcCrudOperationExample2Application implements CommandLineRunner 
{
	@Autowired
	private StudentDao studentDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProject5JdbcCrudOperationExample2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Student student=new Student("omkar","nipani","98%");
//  	Student student=new Student("prathith","udupi","99%");
//		boolean status=studentDao.insertStudent(student);
//		
//		if(status)
//		{
//			System.out.println("Student inserted Succefully");
//		}
//		else
//		{
//			System.out.println("Student not inserted Succefully");
//		}
		
//		Student student=new Student("suyog","99%","banglore");
//		boolean status=studentDao.updateStudent(student);
//		if(status)
//		{
//			System.out.println("Student updated Succefully");
//		}
//		else
//		{
//			System.out.println("Student not updated Succefully");
//		}
		
//		boolean status=studentDao.deleteStudent("banglore");
//		if(status)
//		{
//			System.out.println("Student deleted Succefully");
//		}
//		else
//		{
//			System.out.println("Student not deleted Succefully");
//		}
		
//		Student student=studentDao.getStudentByCity("nipani");
//		System.out.println("name;"+student.getName());
//		System.out.println("city;"+student.getCity());
//		System.out.println("marks;"+student.getMarks());
		
		List<Student> list=studentDao.getAllStudent();
		for(Student student: list)
		{
			System.out.println("name :"+student.getName());
			System.out.println("city :"+student.getCity());
			System.out.println("marks :"+student.getMarks());
		}
	}

}
