import java.util.List;

public class Employee implements IEmployee{
    private String name;
    private String position;
    private int salary;
    private List<IEmployee> subordinates;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String dept) {
        this.position = dept;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void add(IEmployee e) {
        subordinates.add(e); 
    }

    @Override
    public void print() {
        System.out.println("Employee :[ Name : " + name + ", position : " + position + ", salary : " + salary + " ]");
    }
}