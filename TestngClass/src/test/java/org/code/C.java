package org.code;

import org.testng.annotations.Test;

public class C {
	
	@Test(groups = {"smoke"})
	
	private void tc1() {
		System.out.println("tc1");

	}
	@Test(groups = {"sanity"})
	private void tc2() {
		System.out.println("tc2");

	}
	@Test(groups = { "smoke","regression"})
	private void tc3() {
		System.out.println("tc3");

	}

}
