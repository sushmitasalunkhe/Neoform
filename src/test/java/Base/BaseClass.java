package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
     static long startTime, endTime;
    // Constant for Database Password
    public static void initialization() {
        System.setProperty("webdriver.gecko.driver", "/home/namastecredit172/Downloads/NeoForm/Drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(02, TimeUnit.MINUTES);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        startTime = System.currentTimeMillis();
        driver.get("http://13.229.72.180:5000/namaste_biz");
        endTime = System.currentTimeMillis();
        System.out.println("Page load time for " + " is (in milliseconds) : " + (endTime -startTime));

    }

    public static String getOtp() throws Exception {
        Connection con = null;

        // Statement object

        Statement stmt;

        // Constant for Database URL
        // public static String DB_URL="jdbc:mysql://18.136.14.70:3306/ncbusinees.user_otp";
        String DB_URL = "jdbc:mysql://ncbiztestenv.chaqiqb07wh0.ap-southeast-1.rds.amazonaws.com:3306/ncbusiness";

        // Constant for Database Username

        String DB_USER = "testadmin1";

        String DB_PASSWORD = "testadmin123";
        String dbClass = "com.mysql.jdbc.Driver";

        Class.forName(dbClass).newInstance();

        // Get connection to DB

        con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

        // Statement object to send the SQL statement to the Database

        stmt = con.createStatement();

        String query = "select otp from user_otp order by id desc";

        // Get the contents of userinfo table from DB

        ResultSet res = stmt.executeQuery(query);

        // Print the result untill all the records are printed

        // res.next() returns true if there is any next record else returns false

        List<String > otps=new ArrayList<String>();
        while (res.next())

        {

            String otp=res.getString(1);
            otps.add(otp);

        }
        System.out.println(otps.get(0));
        String Otp=otps.get(0);
        return Otp;
    }
    public void uploadFile(WebDriver driver, WebElement el) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        // To click on file upload button
        el.click();
        // path is the absolute path of the image ex:
        // image(C:\\Users\\Rahul\\Desktop\\Buyer_Detail_View.png)
        Thread.sleep(5000);
        StringSelection stringSelection = new StringSelection("/home/namastecredit172/Downloads/NeoForm/Files/xyz.png");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }
}
