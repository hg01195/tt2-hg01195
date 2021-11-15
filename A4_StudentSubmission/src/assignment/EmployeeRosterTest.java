package assignment;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.Test;

public class EmployeeRosterTest {


	/*Please type your tests here
	*Make sure you write tests for both the input files.
	 * 
	 * Write tests for the following methods : 
	 * computePayrollForAllEmployees, getInvalidEmployeeType, getBadRecords, saveSouthernStudentsMonthlyOnly
	*/
	
	@Test
	public void test1() {
		EmployeeRoster er = new EmployeeRoster();
		er.loadEmployeesFromFile("empFile1.txt");
		double actual = er.computePayrollForAllEmployees();
		double expected = 9379.0;
		assertEquals(expected, actual,0);
	}
	


}
