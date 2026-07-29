package TasksRelation2;

import java.util.List;

public class Pationt {

    private long id;
    private String name;
    private int age;

    private List <Doctor> doctors;

    public Pationt() {
    }


    public Pationt(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctor(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "Pationt{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
