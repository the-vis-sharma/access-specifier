import student.Student;
import teacher.Teacher;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.play();
        student1.className = "12th";

//        student1.rollNo = 123;
        // student1.fatherName = "papa";

        Teacher teacher1 = new Teacher();

        System.out.println("Hello World");
    }

}


/*

        1. Public       - Anywhere
        2. Default      - Same package
        3. Protected    - Same package + child class (same/other/outside package)
        4. Private      - only within same class

 */