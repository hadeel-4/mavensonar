package tes;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

import white.whiteboxtest;

public class whitetest {
	@Before
	public void setUp()throws Exception{
		
	}

	
	
	@Test
	public void test_numbers_numbers() {
		whiteboxtest.findMinMax(new String[] {});
		String result=whiteboxtest.result;
		assertTrue(result.equals("nonumbers"));
	}



	@Test
	public void test_exactleone() {
		whiteboxtest.findMinMax(new String[] {"17"});
		String result=whiteboxtest.result;
		assertTrue(result.equals("17,17"));
	}

	@Test
	public void test_exactlytwonumbers() {
		whiteboxtest.findMinMax(new String[] {"27","29"});
		String result=whiteboxtest.result;
		assertTrue(result.equals("27,29"));
	}

	@Test
	public void test_exactlyTwoNumbersButSecondSmallerThanFirst() {
		whiteboxtest.findMinMax(new String[] {"39","37"});
		String result=whiteboxtest.result;
		assertTrue(result.equals("37,39"));
	}

	@Test
	 public void test_AtLeastThreeNumbers() {
		whiteboxtest.findMinMax(new String[] {"49","47","48"});
		String result=whiteboxtest.result;
		assertTrue(result.equals("47,49"));
	}






}
