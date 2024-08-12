package school_management_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher janaka = new Teacher(1, "Janaka Abeywardane", 1000);
        Teacher sujith = new Teacher(2, "Sujith Liyanage", 1200);
        Teacher chandrani = new Teacher(3, "Chandrani Dias", 1500);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(janaka);
        teacherList.add(sujith);
        teacherList.add(chandrani);

        Student yasiru = new Student(1, "Yasiru Thanthirige", 11);
        Student hasindu = new Student(2, "Hasindu Randika", 12);
        Student anushka = new Student(3, "Anushka Subasinghe", 13);

        List<Student> studentList = new ArrayList<>();
        studentList.add(yasiru);
        studentList.add(hasindu);
        studentList.add(anushka);

        School rcm = new School(teacherList, studentList);

        yasiru.payFees(5000);
        hasindu.payFees(7000);
        System.out.println("Total Money Earned: " + rcm.getTotalMoneyEarned());
        janaka.paySalary();
        System.out.println("Total Money Remaining: " + rcm.getTotalMoneyRemaining());

    }
}
