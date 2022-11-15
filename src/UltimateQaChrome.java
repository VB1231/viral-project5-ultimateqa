import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class UltimateQaChrome {
    public static void main(String[] args) {
        String baseUrl="https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        //maximise browser
        driver.manage().window().maximize();
        //set time delay
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //set username
        WebElement userField = driver.findElement(By.id("user[email]"));
        userField.sendKeys("viralbrahmbhatt@hotmail.com");
        //set password
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("Welcome123");
        //close the browser
        driver.quit();
    }
}
