package university;

import mylib.MyArrayList;

public class Course {
    private int code;
    private String title;
    private String teacher;

    private MyArrayList students = new MyArrayList();

    public Course(int code, String title, String teacher) {
        this.code = code;
        this.title = title;
        this.teacher = teacher;
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
        students.add(student);
        student.addCourse(this);
    }


    public String listAttendees() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < students.size(); i++) {
            stringBuilder.append(students.get(i).toString()).append("\n");
        }
        return stringBuilder.toString();
    }
}
