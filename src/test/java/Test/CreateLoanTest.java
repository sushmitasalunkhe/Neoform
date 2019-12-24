package Test;

import Base.BaseClass;
import Page.CreateLoanPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CreateLoanTest extends BaseClass {
    CreateLoanPage createLoanPage;
    public CreateLoanTest(){
        super();
    }
    @BeforeMethod
    public void setUp() {
        initialization();
        createLoanPage = new CreateLoanPage();
    }
    @Test(priority = 1)

    public void createLoantest() throws Exception {
        createLoanPage.Createloan();
    }
    @AfterMethod
    public void tearDown() {
      //  driver.quit();
    }
}
