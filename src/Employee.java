public class Employee {
   private String fio;
   private String department;
   private int salary;

    public Employee(String fio, String department, int salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;

    }
    public String getFio() {return this.fio;}
    public String getDepartment(){return this.department;}
    public int getSalary(){return this.salary;}
    public void setFio(String fio) {this.fio = fio;}
    public void setDepartment(String department) {this.department = department;}
    public void setSalary(int salary) {this.salary = salary;}
}
