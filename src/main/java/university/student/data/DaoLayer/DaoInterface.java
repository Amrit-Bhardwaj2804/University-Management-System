package university.student.data.DaoLayer;

import org.springframework.data.jpa.repository.JpaRepository;

import university.student.data.entity.StudentData;

public interface DaoInterface extends JpaRepository<StudentData, Long>{
	
	/* No need for implementing this interface.
	 * 
	 * JpaRepository is an interface that specifies methods to be implemented.
	 * Hibernate Classes implement the JpaRepository.
	 * Hence, we will AutoWire the dependency. 
	 * */
}
