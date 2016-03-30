package marlabs;

import java.util.HashMap;
import java.util.Map;

public class Customer {
	private long custID;
	private int nameSpace;
	public Customer(long custID,int nameSpace)
	{
		super();
		this.custID=custID;
		this.nameSpace=nameSpace;
		
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Customer))
			return false;
		if(obj==this)
			return true;
		return this.custID==((Customer) obj).custID&&this.nameSpace==((Customer) obj).nameSpace;
	}
	public int hashCode()
	{
		int result=0;
		result=(int) (custID/12)+nameSpace;
		return result;
	}
	public static void main(String[] a)
	{
		Map m=new HashMap();
		m.put(new Customer(1234567L,0), "John Smith");
		System.out.println(m.get(new Customer(1234567L,0)));
	}

}
