package marlabs;

import java.util.ArrayList;

public class Employee_ODP {
	double salary;
	ArrayList<Observer> observers =new ArrayList<Observer>();
	public void notifyObservers(){
		for(Observer obs: observers){
			obs.update();
		}
	} 
	public Employee_ODP(double salary)
	{
		this.salary=salary;
	}
	public void attach(Observer obs){
		observers.add(obs);
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
		notifyObservers();
	}
			

}
