package org.multipleinheritance;

public class Multiple4 implements Multiple,Multiple2,Multiple3 {

	@Override
	public void jobRole() {
System.out.println("testing");		
	}

	@Override
	public void jobCode() {
System.out.println("555");		
	}

	@Override
	public void personCode() {
System.out.println("nnn");		
	}

	@Override
	public void personName() {
System.out.println("Nagma");		
	}

	@Override
	public void countryCode() {
System.out.println("IND");		
	}

	@Override
	public void countryName() {
System.out.println("INDIA");		
	}

	public void result() {
System.out.println("Selected for the role");
	}
	public static void main(String[] args) {
		Multiple4 m = new Multiple4();
		m.countryCode();
		m.countryName();
		m.jobCode();
		m.jobRole();
		m.personCode();
		m.personName();
		m.result();
		
	}
}
