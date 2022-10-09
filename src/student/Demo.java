package student;

public class Demo {

    void run() {
        Student student = new Student();
        // We can access name and study because they are in same package
        student.name = "Vishnu";
        student.study();

        student.play();
        student.className = "12th";

        student.rollNo = 124;
    }

}
