import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CommonMethods {
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
