package marlabs;

public class FinancialObserver extends Observer{
	private Employee_ODP employee;

	public FinancialObserver(Employee_ODP employee)
	{
		this.employee=employee;
		this.employee.attach(this);
	}
	public void update(){
		if(employee.getSalary()>7500)
			System.out.println("For finance we need to recalculate the tax adding bonus components");
		else
			System.out.println("For finance Only tax to will recalculate");
	}

}
