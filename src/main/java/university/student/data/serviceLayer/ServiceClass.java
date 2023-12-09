package university.student.data.serviceLayer;

/* import classes from local packages or Java API. */
import java.util.List;
import university.student.data.DaoLayer.DaoInterface;
import university.student.data.entity.StudentData;

/* import annotations here */
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/* To, @Autowire ServiceInterface we will be needing a Service.
 * So, @Service annotation helps "IOC-Container" to find this class,
 * and inject it's object there. */

/* Our Business Logic is written here. */

@Service
public class ServiceClass implements ServiceInterface{

	@Autowired
	private DaoInterface dao; /* = new someHibernateClassETC(); */
	 
	@Override
	public List<StudentData> getAllStudentData() {
		
		return dao.findAll();
	}

	@Override
	public StudentData addStudentData(StudentData data) {
		
		return dao.save(data);
	}

	@Override
	public StudentData updateStudentData(StudentData data) {
		
		return dao.save(data);
	}
	
	@Override
	public boolean deleteStudentData(long id) {
		
		//dao.deleteById(id); Deprecated method.
		dao.delete(dao.getReferenceById(id));
		return true;
	}
}
