package TestNG;

import org.testng.annotations.Test;

public class DriveACar {

	@Test(priority=0)
	public void startTheCar() {
		System.out.println("Start Car");
	}
	@Test(priority=1)
	public void putFirstGear() {
		System.out.println("first gear");
	}
	@Test(priority=2)
	public void putSecGear() {
		System.out.println("sec gear");
	}
	@Test(priority=3)
	public void putThirdGear() {
		System.out.println("Third gear");
	}
	@Test(priority=4)
	public void putFourthGear() {
		System.out.println("fourth gear");
	}
}
