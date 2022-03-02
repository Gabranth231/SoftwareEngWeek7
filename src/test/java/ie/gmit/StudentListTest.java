package ie.gmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class StudentListTest {
    @Test
    public void addStudent() {
        Student s1 = new Student("Chris Barry","cbarry@gmit.ie");
        StudentList studentList = new StudentList();
        studentList.addStudent(s1);
        assertFalse(studentList.getStudents().isEmpty());
    }
    @Test
    public void studentNotFound() {
        StudentList studentList = new StudentList();
        assertEquals(null,studentList.searchList("Tim"));
    }
    @Test
    public void searchStudentList(){
        Student s1 = new Student("Chris Barry","cbarry@gmit.ie");
        StudentList studentList = new StudentList();
        studentList.addStudent(s1);
        assertEquals(s1,studentList.searchList("Chris Barry"));
    }
}
