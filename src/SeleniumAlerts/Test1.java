package SeleniumAlerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.InputEvent;

public class Test1 {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrime.driver","C:\\Selenium webdriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        driver.findElement(By.id("alert1")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        Thread.sleep(3000);
        alert.accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
        //Robot class manily helps handeling the mouse and keyboard functions
        Robot robot = new Robot();
        robot.mouseMove(400,15);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Thread.sleep(2000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        driver.quit();
    }
}
