package in.sp.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.sp.main.entity.Student;
import in.sp.main.mapper.StudentRowMapper;

@Repository
public class StudentDao 
{
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	public boolean insertStudent(Student student)
	{
		boolean status=false;
		try
		{
			String SQL_INSERT_QUERY="insert into student(name,city,marks) values(?,?,?)";
			int count=jdbctemplate.update(SQL_INSERT_QUERY, student.getName(),student.getCity(),student.getMarks());
			
			if(count>0)
			{
				status=true;
			}
			else
			{
				status=false;
			}
			
		}
		catch(Exception e)
			{
				status=false;
				e.printStackTrace();
			}
		
		return status;
		
	}
	
	public boolean updateStudent(Student student)
	{
		boolean status=false;
		try
		{
			String SQL_UPDATE_QUERY="update student set name=?, marks=? where city=?";
			int count=jdbctemplate.update(SQL_UPDATE_QUERY, student.getName(),student.getCity(),student.getMarks());
			
			if(count>0)
			{
				status=true;
			}
			else
			{
				status=false;
			}
		}
		catch(Exception e)
		{
			status=false;
			e.printStackTrace();
		}
		return status;
		
	}
	
	public boolean deleteStudent(String city)
	{
		boolean status=false;
		try
		{
			String SQL_DELETE_QUERY="delete from student where city=?";
			int count=jdbctemplate.update(SQL_DELETE_QUERY, city);
			
			if(count>0)
			{
				status=true;
			}
			else
			{
				status=false;
			}
			
		}
		catch(Exception e)
		{
			status=false;
			e.printStackTrace();
		}
		return status;
		
	}
	
	public Student getStudentByCity(String city)
	{
		String SQL_SELECT_QUERY="select * from student where city=?";
		return jdbctemplate.queryForObject(SQL_SELECT_QUERY,new StudentRowMapper(),city);
		
	}
	
	public List<Student> getAllStudent()
	{
		String SQL_SELECT_QUERY="select * from Student";
		return jdbctemplate.query(SQL_SELECT_QUERY, new StudentRowMapper());
		
	}

}
