package student;

import student.fee.Fee;
import student.mark.Mark;

public class Student {

    String name;
    protected int rollNo;
    private String fatherName;
    String motherName;
    String village;
    public String className;

    Fee fees;
    Mark marks;


    // Default - we can only use/access method/class variable in same package
    void study() {
        System.out.println("Student pdh ryo h..." + this.fatherName);
    }

    // Public - we can access/use method/class variable anywhere in the project
    public void play() {
        System.out.println("Student khel ryo h...");
    }

}
