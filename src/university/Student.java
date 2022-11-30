package university;

import mylib.MyArrayList;

public class Student {
    private int id;
    private String firstName;
    private String lastName;

    private MyArrayList courses = new MyArrayList();

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
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
        for (int i = 0; i < courses.size(); i++) {
            stringBuilder.append(courses.get(i).toString()).append("\n");
        }
        return stringBuilder.toString();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
}
