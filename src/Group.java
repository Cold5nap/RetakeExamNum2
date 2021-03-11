import java.util.List;

public class Group {
    private String name;
    private List<Student> listOfStudents;
    private String specialization;

    public Group(String name, List<Student> listOfStudents, String specialization) {
        this.name = name;
        this.listOfStudents = listOfStudents;
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
