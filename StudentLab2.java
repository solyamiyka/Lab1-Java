package student;
import java.util.ArrayList;

public class Student {

    private int id;
    private String Surname;
    private String Name;
    private String patronymic;
    private String birth;
    private String address;
    private int number;
    private String faculty;
    private int course;
    private String group;

    public Student(int id, String surname, String name, String patronymic, String birth,
                   String address, int number, String faculty, int course, String group) {
        this.id = id;
        this.Surname = surname;
        this.Name = name;
        this.patronymic = patronymic;
        this.birth = birth;
        this.address = address;
        this.number = number;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getSurname() { return Surname; }
    public void setSurname(String surname) { Surname = surname; }

    public String getName() { return Name; }
    public void setName(String name) { Name = name; }

    public String getPatronymic() { return patronymic; }
    public void setPatronymic(String patronymic) { this.patronymic = patronymic; }

    public String getBirth() { return birth; }
    public void setBirth(String birth) { this.birth = birth; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }

    public String getFaculty() { return faculty; }
    public void setFaculty(String faculty) { this.faculty = faculty; }

    public int getCourse() { return course; }
    public void setCourse(int course) { this.course = course; }

    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }

    @Override
    public String toString() {
        return "\n***********************************************************************************************************************************************************" +
                "\n ID: " + id +
                "\t\t\t\t   Surname:'" + Surname + '\'' +
                "\t\t Name:'" + Name + '\'' +
                "\t\t Patronymic:'" + patronymic + '\'' +
                "\t\t Birth:'" + birth + '\'' +
                "\n address:'" + address + '\'' +
                "\t\t number =>" + number +
                "\t\t faculty:'" + faculty + '\'' +
                "\t\t course:'" + course + '\'' +
                "\t\t group:'" + group + '\'' ;
    }
}
