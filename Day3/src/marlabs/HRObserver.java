package marlabs;

public class HRObserver extends Observer{
private Employee_ODP employee;

public HRObserver(Employee_ODP employee)
{
	this.employee=employee;
	this.employee.attach(this);
}
public void update()
{
	if(employee.getSalary()>75000)
		System.out.println("For HR- We will change the designation");
	else 
		System.out.println("For HR - There is no designation change");
}
}
