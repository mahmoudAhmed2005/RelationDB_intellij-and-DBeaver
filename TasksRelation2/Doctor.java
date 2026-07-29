package TasksRelation2;

import java.util.List;

public class Doctor {

    private long id;
    private String name;
    private double salary;

    private List <Pationt> pationts;


    public Doctor() {
    }

    public Doctor(long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Pationt> getPationts() {
        return pationts;
    }

    public void setPationts(List<Pationt> pationts) {
        this.pationts = pationts;
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +

                '}';
    }
}
