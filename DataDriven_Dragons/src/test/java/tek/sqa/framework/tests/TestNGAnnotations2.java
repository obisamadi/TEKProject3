package tek.sqa.framework.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import tek.sqa.framework.base.BaseUITest;

public class TestNGAnnotations2 extends BaseUITest {
	@BeforeClass
	public void befreClass() {
		//before storing the data in the excel and .properties files,
		//I should clean up the old data 
		System.out.println("Before Class: Write code implemenation to clear data");
	}
	
	@Test(groups= {"sanity", "regression"})
	public void test1() {
		System.out.println("Test1: Store the data in an excel file");
	}
	
	@Test(groups= "regression")
	public void test2() {
		System.out.println("Test 2: Store the data in a .properties file");
	}
	
	@Test(groups= {"sanity", "regression"})
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test(groups = "regression")
	public void test4() {
		System.out.println("Test 4");
	}
}

