package jUnitTestingPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import jUnitTestingPackage.AllTests.testAddStrings;

@RunWith(Suite.class)
@SuiteClasses({ testAddNumbers.class, testAddStrings.class})
public class AllTests {

	public class testAddStrings {

	}

}
