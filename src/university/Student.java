package university;

public class Student {
    private int id;
    private String firstName;
    private String lastName;

    private Course[] courses;

    private int count;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        courses = new Course[25];
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return id + " " + firstName +  " " + lastName;
    }

    public String studyPlan() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(courses[i].toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    public void addCourse(Course course) {
        courses[count++] = course;
    }
}
