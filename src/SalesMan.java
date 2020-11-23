
public class SalesMan extends Employee {
    private int  commission;
    private String zoneSale;
    private String name;
    private String email;
    private int employeeNumber;
    private int salary;
    private final Position position;

    @Override
    public Position getPosition() {
        return position;
    }

    public SalesMan(String name, int employeeNumber, Position position) {
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.position = position;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public String getZoneSale() {
        return zoneSale;
    }

    public void setZoneSale(String zoneSale) {
        this.zoneSale = zoneSale;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    @Override
    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
