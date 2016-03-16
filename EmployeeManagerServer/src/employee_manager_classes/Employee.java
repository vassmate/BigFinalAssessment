package employee_manager_classes;

public class Employee extends Person {

	private int salary;
	private String jobTiitle;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getJobTiitle() {
		return jobTiitle;
	}

	public void setJobTiitle(String jobTiitle) {
		this.jobTiitle = jobTiitle;
	}
}
