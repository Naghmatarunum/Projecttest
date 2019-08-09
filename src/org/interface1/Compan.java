package org.interface1;

public class Compan implements Interface {

	@Override
	public void empId() {
System.out.println("12345");		
	}

	@Override
	public void empName() {
System.out.println("Sana"
		+ "");		
	}

	@Override
	public void empEmail() {
System.out.println("shaik@gmail.com");		
	}
	
	public void compName() {
System.out.println("xome");
	}
public static void main(String[] args) {
	Compan c = new Compan();
	c.compName();
	c.empEmail();
	c.empId();
	c.empName();
}
}
