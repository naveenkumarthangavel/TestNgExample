package org.code;

import org.testng.annotations.Test;

public class A {
	//@Test(priority=-28)
	//private void ta1() {
	//	System.out.println("A1");
		
		
		

	//}
	//@Test(priority=-85,enabled=false)
	//private void ta2() {
	//	System.out.println("A2");


	//}
	//@Test
//private void ta3() {
//	System.out.println("A3");
	


//}
//	@Test(priority=-18)
//private void ta4() {
//	System.out.println("A4");


//}
//	@Test(priority=25,invocationCount = 4)
//private void ta5() {
//	System.out.println("A5");//


//}
	  
	
	// to use suite level exetion class i start so that i skip this method
	
	@Test(groups ={"smoke" })
	 private void ta1() {
	System.out.println("ta1");

	}
	 @Test(groups ={"sanity"})
	 private void ta2() {
		 System.out.println("ta2");

	}
	 @Test(groups = { "regression"})
	 private void ta3() {
		 System.out.println("ta3");

	}
	
}
