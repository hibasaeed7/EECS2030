package Lab1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class LabTest extends Lab {

	@Test
	void testGetMyID() {
		String result = getMyID();
        // Expected value
        String expected = "219506864";
        // Assert that the result matches the expected value
        assertEquals(expected, result, "The ID should be 219506864.");	}

	@Test
	void testGetLetterGrade() {
		assertEquals("A+", getLetterGrade(90), "Grade 90 should be A+.");
        
        // Grade >= 80 should return "A"
        assertEquals("A", getLetterGrade(85), "Grade 85 should be A.");
        
        // Grade >= 75 should return "B+"
        assertEquals("B+", getLetterGrade(75), "Grade 75 should be B+.");
        
        // Grade >= 70 should return "B"
        assertEquals("B", getLetterGrade(72), "Grade 72 should be B.");
        
        // Grade >= 65 should return "C+"
        assertEquals("C+", getLetterGrade(68), "Grade 68 should be C+.");
        
        // Grade >= 60 should return "C"
        assertEquals("C", getLetterGrade(63), "Grade 63 should be C.");
        
        // Grade >= 55 should return "D+"
        assertEquals("D+", getLetterGrade(58), "Grade 58 should be D+.");
        
        // Grade >= 50 should return "D"
        assertEquals("D", getLetterGrade(52), "Grade 52 should be D.");
        
        // Grade >= 45 should return "E"
        assertEquals("E", getLetterGrade(48), "Grade 48 should be E.");
        
        // Grade < 45 should return "F"
        assertEquals("F", getLetterGrade(40), "Grade 40 should be F.");
	}

	@Test
	void testAddAndChangeScale() {
		// Arrange: Create a test case with a set of grades
        ArrayList<Double> grades = new ArrayList<Double>();
        grades.add(92.5);
        grades.add(90.0);
        grades.add(100.0);
        grades.add(100.0);
        grades.add(94.0);

        
        // Expected value
        double expected = (92.5 + 90.0 + 100.0 + 100.0 + 94.0) / 5 / 10;  // (476.5 / 5) / 10 = 9.53
        
        // Act: Call the method with the test data
        double result = addAndChangeScale(grades);
        
        // Assert: Compare the result with the expected value
        assertEquals(expected, result, 0.0001);
        
     // Arrange: Create a test case with a set of grades
        ArrayList<Double> grades1 = new ArrayList<Double>();
        grades1.add(90.0);
        grades1.add(95.0);
        grades1.add(100.0);
        
        // Expected value
        double expected1 = (90.0 + 95.0 + 100.0 ) / 3 / 10;  // (285.0 / 3) / 10 = 9.5
        
        // Act: Call the method with the test data
        double result1 = addAndChangeScale(grades1);
        
        // Assert: Compare the result with the expected value
        assertEquals(expected1, result1, 0.0001);

	}

}
