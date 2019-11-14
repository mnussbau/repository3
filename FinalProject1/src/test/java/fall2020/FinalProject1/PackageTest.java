package fall2020.FinalProject1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PackageTest {

	

	
	@Test
	public void testCalculateShippingCharge() {
		double d = Package.calculateShippingCharges(8);
		double cost = 2.50;
		assertEquals(cost, d, 2);
		
	}
	
	@Test
	public void testCalculateShippingChargesDistance() {
		double d = Package.calculateShippingChargesDistance(100);
		double cost = 2.50;
		assertEquals(cost, d, 2);
		
	}
	
	@Test
	public void testTotal() {
		double d = Package.calculateShippingCharges(8);
		double e = Package.calculateShippingChargesDistance(100);
		double cost = 10.50;
		double total = Package.getTotal(d, e);
		assertEquals(cost, total, 2);
		
	}
	

}
