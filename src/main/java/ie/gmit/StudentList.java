package ie.gmit;

import java.util.ArrayList;

public class StudentList {
    private ArrayList<Student> Students;
    public StudentList(){
        Students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        Students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return Students;
    }

    public Student searchList(String name){
        for(Student a : Students){
            if(a.getsName() == name){
                return a;
            }
        }
        return null;
    }
}
