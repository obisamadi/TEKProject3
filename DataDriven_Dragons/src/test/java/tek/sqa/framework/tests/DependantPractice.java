package tek.sqa.framework.tests;

import org.testng.annotations.Test;

import tek.sqa.framework.base.BaseUITest;

public class DependantPractice extends BaseUITest {
	@Test(dependsOnMethods = "test2")
	public void test1() {
		System.out.println("Login to the application");
	}
	
	@Test
	public void test2() {
		System.out.println("Register with the application");
	}
	
	@Test(dependsOnMethods = "test1")
	public void test3() {
		System.out.println("puchase items online");
	}

}

