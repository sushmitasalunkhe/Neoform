package Page;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CreateLoanPage extends BaseClass {
    @FindBy(xpath="//input[@id='bizlandinf_loan_amount']")
    WebElement LoanAmountBox;
    @FindBy(xpath="//input[@id='bizlandinf_dfirstname0']")
    WebElement ApplicantsName;
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[3]/div[2]/div[1]/span[1]/span[1]/div[1]/i[1]/*")
    WebElement DatePicker;
    @FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]")
    WebElement SelectDate;
    @FindBy(xpath="//input[@id='bizlandinf_business_name']")
    WebElement BusinessName;
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[5]/div[2]/div[1]/span[1]/div[1]/div[1]/span[1]/i[1]/*")
    WebElement selectEntityTypeDropDown;
    @FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]")
    WebElement SelectEntity;
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[6]/div[2]/div[1]/span[1]/div[1]/div[2]/input[1]")
    WebElement Pincode;
    @FindBy(xpath="//button[@id='next_1']")
    WebElement Next_1;
    @FindBy(xpath="//input[@id='bizlandinf_emi_obligation']")
    WebElement Emibox;
    @FindBy(xpath="//input[@id='bizlandinf_annual_revenue']")
    WebElement TurnOver;
    @FindBy(xpath="//input[@id='bizlandinf_gstin']")
    WebElement GSTIN;
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[4]/div[2]/div[1]/span[1]/span[1]/div[1]/i[1]/*")
    WebElement DatePicker1;
    @FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]")
    WebElement SelectDate1;
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[5]/div[2]/div[1]/span[1]/div[1]/div[1]/span[1]/i[1]/*")
    WebElement BusinessIndustrydropDown;
    @FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[5]")
    WebElement BusinessIndustry;
    @FindBy(xpath="//input[@id='bizlandinf_email']")
    WebElement Email;
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[7]/div[2]/div[1]/span[1]/input[1]")
    WebElement MobileNumber;
    @FindBy(xpath="//button[@id='bizlandinf_button']")
    WebElement GetOtpbtn;
    @FindBy(xpath = "//input[@id='bizlandinf_otp']")
    WebElement enterOtp;
    @FindBy(xpath = "//button[@id='next_2']")
    WebElement next_2;
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/span[1]/div[1]/div[2]/input[1]")
    WebElement UnsecuredLoans;
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[2]/div[2]/div[1]/span[1]/div[1]/div[2]/input[1]")
    WebElement emiBounceCount;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/div[2]/div[2]/form/div[1]/div[4]/div[2]/div/span/span/div[1]/span")
    WebElement panCardUpload;
    @FindBy(xpath = "//input[@id='bizlandinf_CIBIL_check']")
    WebElement CIBIL_check;
    @FindBy(xpath = "//button[@id='submit']")
    WebElement submit;


    public CreateLoanPage(){
        PageFactory.initElements(driver,this);
    }

    public void Createloan() throws Exception {
        LoanAmountBox.sendKeys("50");
        ApplicantsName.sendKeys("sdssd");
        DatePicker.click();

        SelectDate.click();

        BusinessName.sendKeys("Business");
        selectEntityTypeDropDown.click();
        SelectEntity.click();
        Pincode.sendKeys("400042");
        Thread.sleep(10000);
        Next_1.click();
        //step2
        Emibox.sendKeys("10000");
        TurnOver.sendKeys("100000");
        GSTIN.sendKeys("01ABCDE1234F1ZA");
        DatePicker1.click();
        SelectDate1.click();
        BusinessIndustrydropDown.click();
        BusinessIndustry.click();
//	List<WebElement> BusinessIndustries=driver.findElements(By.className("ant-select-selection__rendered"));
//	System.out.println(BusinessIndustries.get(0));
        Email.sendKeys("hsbdnsa@test.com");
        MobileNumber.sendKeys("9999999999");
        GetOtpbtn.click();
        String otp=getOtp();
        enterOtp.sendKeys(otp);
        Thread.sleep(5000);
        next_2.click();
        UnsecuredLoans.sendKeys("6");
        emiBounceCount.sendKeys("6");
       //driver.findElement(By.className("ant-upload-drag-container")).sendKeys("/home/namastecredit172/Downloads/NeoForm/Files/xyz.png");
        panCardUpload.click();
        StringSelection sel = new StringSelection("/home/namastecredit172/Pictures/xyz.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);

        Robot robot = new Robot();
        // Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        // Release Enter
        robot.keyRelease(KeyEvent.VK_ENTER);
        // Press CTRL+V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        // Release CTRL+V
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        //uploadFile(driver,panCardUpload);
        Thread.sleep(10000);
        CIBIL_check.click();
        submit.click();



    }
}
