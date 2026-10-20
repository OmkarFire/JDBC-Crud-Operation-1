package in.sp.main.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.WebRowSet;

import org.springframework.jdbc.core.RowMapper;

import in.sp.main.entity.Student;

public class StudentRowMapper implements RowMapper<Student>
{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		Student student=new Student();
		student.setName(rs.getString("name"));
		student.setCity(rs.getString("city"));
		student.setMarks(rs.getString("marks"));
		return student;
	}

}
