package TestNG;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups= {"Apple"})
	public void apple1() {
		System.out.println("Apple testing");
	}
	@Test(groups= {"Apple"})
    public void apple2() {
    	System.out.println("Apple testing");
	}
	@Test(groups= {"Moto"})
    public void moto1() {
    	System.out.println("moto testing");
    }
	@Test(groups= {"Moto"})
    public void moto2() {
    	System.out.println("moto testing");
    }
	@Test(groups= {"Vivo"})
    public void vivo1() {
    	System.out.println("vivo testing");
    }
	@Test(groups= {"Vivo"})
    public void vivo2() {
    	System.out.println("vivo testing");
    }
	@Test(groups= {"Lenovo"})
    public void lenovo1() {
    	System.out.println("lenovo testing");
    }
	@Test(groups= {"Lenovo"})
    public void lenovo2() {
    	System.out.println("lenovo testing");
    }

}
