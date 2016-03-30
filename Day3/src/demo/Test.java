package demo;

import marlabs.Department;
import marlabs.Employee;

public class Test {
public static void main(String[] args) throws CloneNotSupportedException{
	Department dept = new Department (10,"HR");
	Employee e1=new Employee(25,"Mounika",dept);
	Employee e2=(Employee) e1.clone();
	// we are deep cloning in the above statement
	e2.getDepartment().setName("ADMIN");
	// After deep cloning even if you try to change the cloned object it will not change
	System.out.println(e1.getDepartment().getName());
	
}
}
