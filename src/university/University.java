package university;

/**
 * This class represents a university education system.
 * 
 * It manages students and courses.
 *
 */
public class University {

	private String name;
	private Rector rector;

	private Student[] students;
	private Course[] courses;

	private int studentId;
	private int courseCode;

	/**
	 * Constructor
	 * @param name name of the university
	 */
	public University(String name){
		this.name = name;
		students = new Student[1000];
		courses = new Course[50];
		studentId = 10000;
		courseCode = 10;
	}
	
	/**
	 * Getter for the name of the university
	 * @return name of university
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Defines the rector for the university
	 * 
	 * @param first
	 * @param last
	 */
	public void setRector(String first, String last){
		rector = new Rector(first, last);
	}
	
	/**
	 * Retrieves the rector of the university
	 * 
	 * @return
	 */
	public String getRector(){
		return rector.toString();
	}
	
	/**
	 * Enroll a student in the university
	 * 
	 * @param first first name of the student
	 * @param last last name of the student
	 * @return
	 */
	public int enroll(String first, String last){
		Student student = new Student(studentId, first, last);
		students[studentId - 10000] = student;
		studentId++;
		return studentId - 1;
	}
	
	/**
	 * Retrieves the information for a given student
	 * 
	 * @param id the id of the student
	 * @return information about the student
	 */
	public String student(int id){
		return students[id-10000].toString();
	}
	
	/**
	 * Activates a new course with the given teacher
	 * 
	 * @param title title of the course
	 * @param teacher name of the teacher
	 * @return the unique code assigned to the course
	 */
	public int activate(String title, String teacher){
		Course course = new Course(courseCode, title, teacher);
		courses[courseCode - 10] = course;
		courseCode++;
		return courseCode - 1;
	}
	
	/**
	 * Retrieve the information for a given course
	 * 
	 * @param code unique code of the course
	 * @return information about the course
	 */
	public String course(int code){
		return courses[code - 10].toString();
	}
	
	/**
	 * Register a student to attend a course
	 * @param studentID id of the student
	 * @param courseCode id of the course
	 */
	public void register(int studentID, int courseCode){
		Student student = students[studentID - 10000];
		Course course = courses[courseCode-10];
		course.addStudent(student);
	}
	
	/**
	 * Retrieve a list of attendees
	 * 
	 * @param courseCode unique id of the course
	 * @return list of attendees separated by "\n"
	 */
	public String listAttendees(int courseCode){
		Course course = courses[courseCode-10];
		return course.listAttendees();
	}

	/**
	 * Retrieves the study plan for a student
	 * 
	 * @param studentID id of the student
	 * @return list of courses the student is registered for
	 */
	public String studyPlan(int studentID){
		Student student = students[studentID - 10000];
		return student.studyPlan();
	}
}
