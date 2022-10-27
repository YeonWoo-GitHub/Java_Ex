package staticEx;

public class StudentTest1 {

    public static void main(String[] args) { // 단축키 psvm

        Student studentJ = new Student();
        System.out.println(studentJ.studentID);

        Student studentT = new Student();
        System.out.println(studentT.studentID);

        System.out.println(Student.getSerialNum());
    }

    // 출력
    // 10001
    // 10002
    // 10002
    // 10002
}
