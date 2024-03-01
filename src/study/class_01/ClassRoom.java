package study.class_01;

import java.util.List;

public class ClassRoom {
    int classNum;
    List<Person> students;

    public ClassRoom() {
    }

    public ClassRoom(int classNum) {
        this.classNum = classNum;
    }

    public ClassRoom(int classNum, List<Person> students) {
        this.classNum = classNum;
        this.students = students;
    }

    public int getClassNum() {
        return classNum;
    }

    public List<Person> getStudents() {
        return students;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public void setStudents(List<Person> students) {
        this.students = students;
    }

    public void addStudent(Person student) {
        students.add(student);
    }

    public int getStudentsNum() {
        return students.size();
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "classNum=" + classNum +
                ", students=" + students +
                "}";
    }


}
