package university.student.data.presentationLayer;

/* import classes from Java-API & local-packages */
import university.student.data.entity.StudentData;
import university.student.data.serviceLayer.*;
import java.util.*;

/* import annotations */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

/* REQUEST HANDLER CLASS.
 * 
 * This class acts as out Rest-api-controller. Any request from web-client
 * will be handled by this very class. And this controller will ask 
 * Service-Layer to deliver the required task. 
 * */
@RestController 
public class MyController{
	
	// Dependency Injection
	@Autowired
	private ServiceInterface service; /* = new ServiceClass(); */
	
	// GET request 1
	@RequestMapping(method = RequestMethod.GET, path = "/home")
	public String home(){
	
		return "Home Endpoint";
	}
	
	// GET request 2
	// RETURNS : List of objects of StudentData class, (in JSON format).
	@GetMapping("/getALLStudentData")
	public List<StudentData> getALLStudentData() {
		
		return this.service.getAllStudentData();
	}
		
	// POST request 
	// RETURNS : Object of StudentData class, added from RequestBody, (in JSON format).
	@PostMapping("/addStudentData")
	public StudentData addStudentData(@RequestBody StudentData data) {
		
		return this.service.addStudentData(data);
	}
	
	// PUT request
	// RETURNS : The updated object in JSON format; uses primary key to check if similar object resides or not.
	@PutMapping("/updateStudentData")
	public StudentData updateStudentData(@RequestBody StudentData data) {
		
		return this.service.updateStudentData(data);
	}
	
	// DELETE request 
	// RETURNS : A String Message, if object is deleted from the database or not.
	@DeleteMapping("/deleteStudentData/{id}")
	public String deleteStudentData(@PathVariable long id) {
			
		if(this.service.deleteStudentData(id))
			return "Student Data deleted successfully.";
		else
			return "Try Again";
	}
}