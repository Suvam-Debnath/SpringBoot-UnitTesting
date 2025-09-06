package com.Suvam.unitTesting.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Suvam.unitTesting.data.SomeDataService;

class SomeDataServiceStub implements SomeDataService{

	@Override
	public int[] retrieveAllData() {
		
		return new int[] {1,2,3};
	}
	
}
class SomeDataServiceEmptyStub implements SomeDataService{

	@Override
	public int[] retrieveAllData() {
		
		return new int[] {};
	}
	
}
class SomeDataServiceOneValueStub implements SomeDataService{

	@Override
	public int[] retrieveAllData() {
		
		return new int[] {4};
	}
	
}
class SomeBusinessStubTest {

	@Test
	public void calculateSumUsingDataService_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDataService(new SomeDataServiceStub());
		int actualResult = business.calculateSumUsingDataService();
		int expectedResult = 6;
		assertEquals(expectedResult,actualResult);
		
	}
	
	@Test
	public void calculateSumUsingDataService_empty() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDataService(new SomeDataServiceEmptyStub());
		int actualResult = business.calculateSumUsingDataService(); 
		int expectedResult = 0;
		assertEquals(expectedResult,actualResult); 
		
	}
	
	@Test
	public void calculateSumUsingDataService_oneValue() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		business.setSomeDataService(new SomeDataServiceOneValueStub());
		int actualResult = business.calculateSumUsingDataService(); 
		int expectedResult = 4;
		assertEquals(expectedResult,actualResult);
		
	}

}
