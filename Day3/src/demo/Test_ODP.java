package demo;

import marlabs.Employee_ODP;
import marlabs.FinancialObserver;
import marlabs.HRObserver;

public class Test_ODP {
	public static void main(String[] args){
		Employee_ODP e1=new Employee_ODP(5000);
		HRObserver hro=new HRObserver(e1);
		FinancialObserver fos=new FinancialObserver(e1);
		System.out.println("About to change the salary");
		e1.setSalary(60000.00);
		System.out.println("About to change the salary");
		e1.setSalary(80000.00);
		
		
	}

}
