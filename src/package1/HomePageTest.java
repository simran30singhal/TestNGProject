package package1;

import org.testng.annotations.Test;

public class HomePageTest {

	@Test(dependsOnMethods={"test6","test8"})
	public void test3() {
		System.out.println("Inside Test case-3");
	}
	
	@Test
	public void test6() {
		
		System.out.println("Inside Test case-6");
	}
	
	@Test
	public void test7() {
		
		System.out.println("Inside Test case-7");
	}
	@Test
	public void test8() {
		
		System.out.println("Inside Test case-8");
	}
}
