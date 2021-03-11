import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Student> task(List<Group> groups) {
        List<Student> ansStudents = new ArrayList<>();
        for (Group group : groups) {
            List<Student> students = group.getListOfStudents();
            for (Student student : students) {
                if (student.getGender() == 'm' && student.getAge() < 17)
                    ansStudents.add(student);
            }
        }
        return ansStudents;
    }

    static void setGroups(List<Group> groups) {
        List<Student> studients1 = new ArrayList<>();
        studients1.add(new Student("Petr", 16, 'm'));
        studients1.add(new Student("Elizabeth", 16, 'w'));
        studients1.add(new Student("George", 19, 'm'));

        List<Student> studients2 = new ArrayList<>();
        studients2.add(new Student("George", 21, 'm'));
        studients2.add(new Student("Oliver ", 19, 'm'));
        studients2.add(new Student("Charlie  ", 15, 'm'));
        studients2.add(new Student("Amelia   ", 16, 'w'));

        List<Student> studients3 = new ArrayList<>();
        studients2.add(new Student("Olivia", 16, 'w'));
        studients2.add(new Student("James ", 15, 'm'));
        studients2.add(new Student("William  ", 19, 'm'));
        studients2.add(new Student("Ava  ", 15, 'w'));

        groups.add(new Group("1.1", studients1, "chemistry"));
        groups.add(new Group("1.2", studients2, "philology"));
        groups.add(new Group("1.3", studients3, "physics"));
    }

    public static void main(String[] args) {

        List<Group> groups = new ArrayList<>();
        setGroups(groups);
        List<Student> students = task(groups);
        for (Student student:students)
            System.out.println(" age = "+student.getAge()+
                    " name = "+ student.getName()+
                    " gender = "+student.getGender());

    }


}
