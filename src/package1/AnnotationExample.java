package package1;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeGroups;

public class AnnotationExample {
	
	
	@BeforeGroups("sanity")
	public void beforegroup() {
		
		System.out.println("Inside Before Group");
	}
	
	@AfterGroups("regression")
	public void aftergroup() {
		
		System.out.println("Inside After Group");
	}
	
	@BeforeTest
	public void beforetest() {
		
		System.out.println("Inside Before Test");
	}
	
	//@BeforeMethod(alwaysRun=true)--- to run this method always
	@BeforeMethod
	public void beforemethod() {
		
		System.out.println("Inside Before Method");
	}

	@Test(priority=1,groups= {"sanity","regression"},enabled=true,description="to test the login scenarios")
	public void test1() {
		
		System.out.println("Inside Test case-1");
	}
	
	@Test(priority=2)
	public void test2() {
		
		System.out.println("Inside Test case-2");
	}
	
	@Test(priority=0)
	public void test5() {
		
		System.out.println("Inside Test case-5");
	}
	
	@AfterMethod
	public void aftermethod() {
		
		System.out.println("Inside After Method");
	}
	
	@AfterTest
	public void aftertest() {
		
		System.out.println("Inside After Test");
	}
}
