package org.abstraction;

public class Company extends Abstract {
@Override
public void empID() {
System.out.println("12345");	
}
@Override
	public void empName() {
System.out.println("Naghma");		
	}
public static void main(String[] args) {
	Company c = new Company ();
	c.empEmail();
	c.empID();
	c.empName();
}
}

