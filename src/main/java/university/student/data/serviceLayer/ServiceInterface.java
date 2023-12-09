package university.student.data.serviceLayer;

import java.util.*;
import university.student.data.entity.StudentData;

public interface ServiceInterface {

	// GET
	public List<StudentData> getAllStudentData();
		
	// POST
	public StudentData addStudentData(StudentData data);

	// PUT
	public StudentData updateStudentData(StudentData data);
	
	// DELETE
	public boolean deleteStudentData(long id);

}
