import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class UltimateQaFireFox {
    public static void main(String[] args) {
        String baseUrl="https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gheko.driver","driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        //maximise the screen
        driver.manage().window().maximize();
        //set time delay
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title
        System.out.println(driver.getTitle());
        //get the page source
        System.out.println(driver.getPageSource());
        //get the current url
        System.out.println(driver.getCurrentUrl());
        //set the username
        WebElement userField = driver.findElement(By.id("user[email]"));
        userField.sendKeys("viralbrahmbhatt@hotmail.com");
        //set the password
        WebElement passwordField = driver.findElement(By.id("user[password]"));
        passwordField.sendKeys("Welcome123");
      //Close browser
        driver.quit();
    }
}
