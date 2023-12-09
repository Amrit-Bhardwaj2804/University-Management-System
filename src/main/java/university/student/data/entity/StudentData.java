/* comments for explanations.... */

package university.student.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/* Entity annotation signifies, that this class's object is a 
   persistence object stored as a record in relation database. 
*/			
@Entity
public class StudentData {
	
	/* All the private fields specifying sudent's data. */

	@Id 
	private long id;/* This field is now a primary key for Entity object. */
	private String name;
	private int age;
	private String course;
	private int course_start;
	private int course_end;
	
	/* No-args constructor */
	public StudentData() {
		super();
	}
	/* Parameterized constructor */
	public StudentData(long id, String name, int age, String course, int course_start, int course_end) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
		this.course_start = course_start;
		this.course_end = course_end;
	}

	/* get name & set name */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/* get age & set age */
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/* get id & set id */
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	/* get course & set course */
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	/* get start & set start */
	public int getCourse_start() {
		return course_start;
	}
	public void setCourse_start(int course_start) {
		this.course_start = course_start;
	}
	
	/* get end & set end */
	public int getCourse_end() {
		return course_end;
	}
	public void setCourse_end(int course_end) {
		this.course_end = course_end;
	}
	
	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", age=" + age + ", course=" + course + ", course_start="
				+ course_start + ", course_end=" + course_end + "]";
	}
	
	/* _____________________________ */
	
}
