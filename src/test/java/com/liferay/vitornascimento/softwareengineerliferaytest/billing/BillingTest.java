package com.liferay.vitornascimento.softwareengineerliferaytest.billing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Before;
import org.junit.Test;

import com.liferay.vitornascimento.entities.Product;
import com.liferay.vitornascimento.softwareengineerliferaytest.entities.MockProducts;

public class BillingTest {
	
	
	MockProducts inputObject;

	    @Before
	    public void setUp() {
	        inputObject = new MockProducts();
	    }

	@Test
	public void foodBuyingTest() {

		Product food = inputObject.mockFood(0);

		assertEquals(food.getPrice(), food.getPrice()/* billing method */ ); // non imported food have no taxes
	}
	
	@Test
	public void drugsBuyingTest() {

		Product medical =  inputObject.mockDrug(0);

		assertEquals(medical.getPrice(), null/* billing method */ ); // non imported drugs have no taxes
	}
	
	@Test
	public void bookBuyingTest() {

		Product book = inputObject.mockBook(0);

		assertEquals(book.getPrice(), null/* billing method */ ); // non imported books have no taxes
	}

}
