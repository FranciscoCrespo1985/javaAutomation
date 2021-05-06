package com.automation.training;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomationTests {
	
	
	@BeforeClass
	public void classStart() 
	{		
		System.out.println("ClassStart");
	}
	@AfterClass
	public void classFinished() 
	{		
		System.out.println("ClassFinished");
	}

	@BeforeTest
	public void testStart() 
	{		
		System.out.println("TestStart");
	}
	@AfterTest
	public void testFinished() 
	{		
		System.out.println("TestFinished");
	}
	@BeforeMethod
	public void login() 
	{
		System.out.println("Loged in to the app");
	}
	
	@AfterMethod
	public void loginOut() 
	{
		System.out.println("Loged out from the app");
	}		
	
	@Test(groups= {"grupo1"})
	public void testConcact() {
		System.out.println("Test 1");
	}
	@Test(groups= {"grupo2","grupo3"})
	public void testCount() {
		System.out.println("Test2");
	}	
	@Test(groups= {"grupo3"})
	public void testConcact2() {
		System.out.println("Test 3");
	}
	@Test(groups= {"grupo1"})
	public void testCount2() {
		System.out.println("Test4");
	}	
	
	@Parameters({"stringA","stringB"})
	@Test(groups= {"grupo1"})
	public void testConcat(String a,String b) 
	{
		String resultado = a+b;
		Assert.assertEquals(resultado,"I love  test automation");
	}
	

}

