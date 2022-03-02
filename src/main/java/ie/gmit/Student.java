package ie.gmit;

public class Student {
    private String sName;
    private String sEmail;

    public Student(String name,String email){
        if(name.isEmpty() || email.isEmpty()){
            throw new IllegalArgumentException("Invalid Data sent");
        }
        else{
            sName = name;
            sEmail = email;
        }
    }

    public String getsName() {
        return sName;
    }

    public String getsEmail() {
        return sEmail;
    }
}
