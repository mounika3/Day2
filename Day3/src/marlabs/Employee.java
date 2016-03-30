package marlabs;

public class Employee implements Cloneable{
	private int employeeId;
	private String employeeName;
	private Department department;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Object clone() throws CloneNotSupportedException{
		Employee cloned=(Employee) super.clone();
		cloned.setDepartment((Department)cloned.getDepartment().clone());
		return cloned;
	}
	public Employee(int employeeId, String employeeName, Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
	}
	

}
