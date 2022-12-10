package hu.petrik.restclient.vargazsigmond_javafxrestclientdolgozat;

public class Salary {
    private String name;
    private int id;
    private int salary;
    private boolean degree;

    public Salary(String name, int id, int salary, boolean degree) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isDegree() {
        return degree;
    }

    public void setDegree(boolean degree) {
        this.degree = degree;
    }
}
