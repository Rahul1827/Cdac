package NGTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void first() {
	  System.out.println("I am in Test case");
  }
  @Test
  public void Second() {
	  System.out.println("I am in Test case");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am in  before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am in  after Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I am in  before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I am in  after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I am in  before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I am in  after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I am in  before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I am in  after suite");
  }

}
