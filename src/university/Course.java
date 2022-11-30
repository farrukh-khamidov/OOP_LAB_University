package university;

public class Course {
    private int code;
    private String title;
    private String teacher;

    private Student[] students;

    private int count = 0;

    public Course(int code, String title, String teacher) {
        this.code = code;
        this.title = title;
        this.teacher = teacher;
        students = new Student[100];
    }

    public String getTitle() {
        return title;
    }

    public String getTeacher() {
        return teacher;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code + "," + title + "," + teacher;
    }

    public void addStudent(Student student) {
        students[count++] = student;
        student.addCourse(this);
    }


    public String listAttendees() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(students[i].toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
