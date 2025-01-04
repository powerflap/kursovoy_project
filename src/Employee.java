public class Employee {
    private static int length;
    String name;
    String surname;
    String patronumic;
    String department;
    int salary;
   

    public Employee(String name,String surname,String patronymic, String department, int salary) {
        this.name = name;
        this.surname =surname;
        this.patronumic =patronymic;
        this.department = department;
        this.salary = salary;

    }
    public String getName() {return this.name;}
    public String getSurname() {return this.surname;}
    public String getPatronumic() {return this.patronumic;}
    public String getDepartment(){return this.department;}
    public int getSalary(){return this.salary;}
    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setPatronumic(String patronumic) {this.patronumic = patronumic;}
    public void setDepartment(String department) {this.department = department;}
    public void setSalary(int salary) {this.salary = salary;}
    public void getEmployeesInfo() {



}}