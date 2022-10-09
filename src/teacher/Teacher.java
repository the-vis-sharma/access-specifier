package teacher;

import student.Student;

public class Teacher {

    String name;
    String[] subjects;
    int salary;


    void test() {
        Student student = new Student();
        // We can't access  default variable/function outside package
//        student.name = "Vishnu";
//        student.study();

        student.play();
        student.className = "12th";
        // we can't access protected data members
//        student.rollNo = 123;

        // student.fatherName = "papa";
    }

}
