package org.code;

import org.testng.annotations.Test;

public class B {

	@Test(groups = { "smoke"})
	private void tb1() {
		System.out.println("tb1");

	}
	@Test(groups = {"sanity"})
	private void tb2() {
		System.out.println("tb2");

	}
	@Test(groups = {"sanity","regression"})
	private void tb3() {
		System.out.println("tb3");

}
}
