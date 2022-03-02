package ie.gmit;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class TestStudent  {
    Student s1;
    @Test
    public void TestName(){
        String expectedString= "Chris Barry";
        s1 = new Student("Chris Barry","cbarry@gmit.ie");
        assertEquals(expectedString,s1.getsName());
    }
    @Test
    public void TestEmail(){
        String expectedString= "mscott@gmit.ie";
        s1 = new Student("Murray Scott","mscott@gmit.ie");
        assertEquals(expectedString,s1.getsEmail());
    }
    @Test
    public void TestIllegalArg(){
        final String invalid = "Invalid Data sent";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class,()->
                new Student("","mscott@gmit.ie"));
        assertEquals(invalid,exceptionThrown.getMessage());
    }
}
