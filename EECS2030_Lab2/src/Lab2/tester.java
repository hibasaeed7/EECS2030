package Lab2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tester {

	 
	@Test
	void test1() {
		int actualSpeed=65;
		int maxSpeed=60;
		boolean stuntDriving=false;
		
        assertEquals(0, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving), "The driver should receive 0 points for an excess speed of 5 km/h.");		
	}
	
	@Test
	void test2() {
		int actualSpeed=85;
		int maxSpeed=60;
		boolean stuntDriving=false;
		
        // Assert
        assertEquals(3, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving), "The driver should receive 3 points for an excess speed of 25 km/h.");		
		
	} 
	
	@Test
	void test3() {
		int actualSpeed=90;
		int maxSpeed=50;
		boolean stuntDriving=false;
		
        // Assert
        assertEquals(4, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving), "The driver should receive 4 points for an excess speed of 40 km/h.");		
		
	}
	 
	@Test
	void test4() {
		int actualSpeed=160;
		int maxSpeed=30;
		boolean stuntDriving=false;
		
        // Assert
        assertEquals(6, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving), "The driver should 6 points for an excess speed of 130 km/h.");		
		
	}
	
	@Test
	void test5() {
		int actualSpeed=20;
		int maxSpeed=30;
		boolean stuntDriving=false;
		
        // Assert
        assertEquals(-1, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving), "The driver should receive 0 points for driving less than limit.");		
		
	}
	
	@Test
	void test6() {
		int actualSpeed=-4;
		int maxSpeed=30;
		boolean stuntDriving=false;
		
        // Assert
        assertEquals(-1, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving), "It is not possible to get less than 0 km/h..");		
		
	}
	
	@Test
	void test7() {
		int actualSpeed=10;
		int maxSpeed=-5;
		boolean stuntDriving=false;
		
        // Assert
        assertEquals(-1, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving), "It is not possible to have a maximum speed less than 0 km/h..");		
		
	}
	
	@Test
	void test8() {
		int actualSpeed=60;
		int maxSpeed=50;
		boolean stuntDriving=true;
		
        // Assert
        assertEquals(6, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving), "The driver is within speed limit but is stunt driving.");		
		
	}
	
	@Test
	void test9() {
		int actualSpeed=80;
		int maxSpeed=50;
		boolean stuntDriving=false;
		
        // Assert
        assertEquals(4, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving), "The driver is within speed limit but is stunt driving.");		
		
	}
	
	@Test
	void test10() {
		int actualSpeed=99;
		int maxSpeed=50;
		boolean stuntDriving=false;
		
        // Assert
        assertEquals(4, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving), "The driver is within speed limit but is stunt driving.");		
		
	}
	
	@Test
	void test11() {
		int actualSpeed=100;
		int maxSpeed=84;
		boolean stuntDriving=false;
		
        // Assert
        assertEquals(3, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving), "The driver is within speed limit but is stunt driving.");		
		
	}
	
	@Test
	void test12() {
		int actualSpeed=99;
		int maxSpeed=70;
		boolean stuntDriving=false;
		
        // Assert
        assertEquals(3, TestingExample.LicencePoints(actualSpeed, maxSpeed, stuntDriving), "The driver is within speed limit but is stunt driving.");		
		
	}
	


}
