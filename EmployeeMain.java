package methodOverride;

/**
 * 1. Add getEmployeeDetails method to the class 'Employee' and extend it in  subclasses representing different types of employees such as HourlyEmployee  and SalariedEmployee and overload getEmployeeDetails. Demonstrate polymorphism by printing various types of Employees by using Parent Class  reference.
 */

public class EmployeeMain {
	public static void main(String args[]) {
		EmployeeDetails emp1 = new HourlyEmployee("Raji", 101, 15.0, 40);
		EmployeeDetails emp2 = new SalariedEmployee("Banu", 102, 50000.0);
		EmployeeDetails emp3 = new HourlyEmployee("Gokila", 103, 20.0, 35);
		EmployeeDetails emp4 = new SalariedEmployee("Arun", 104, 60000.0);

		EmployeeDetails[] employees = { emp1, emp2, emp3, emp4 };

		for (EmployeeDetails emp : employees) {
			System.out.println(emp.getEmployeeDetails());
		}

	}
}

class EmployeeDetails {
	private String name;
	private int id;

	public EmployeeDetails(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getEmployeeDetails() {
		return "Employee [Name: " + name + ", ID: " + id + "]";
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
}

class HourlyEmployee extends EmployeeDetails {
	private double hourlyRate;
	private int hoursWorked;

	public HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
		super(name, id);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public String getEmployeeDetails() {
		return "HourlyEmployee [Name: " + getName() + ", ID: " + getId() + ", Hourly Rate: " + hourlyRate
				+ ", Hours Worked: " + hoursWorked + "]";
	}

	// Getters and Setters
	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
}

class SalariedEmployee extends EmployeeDetails {
	private double annualSalary;

	public SalariedEmployee(String name, int id, double annualSalary) {
		super(name, id);
		this.annualSalary = annualSalary;
	}

	@Override
	public String getEmployeeDetails() {
		return "SalariedEmployee [Name: " + getName() + ", ID: " + getId() + ", Annual Salary: " + annualSalary + "]";
	}

	// Getters and Setters
	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
}
