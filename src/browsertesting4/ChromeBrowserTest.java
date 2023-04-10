package browsertesting4;
/**
 * * 1. Setup chrome browser
 *  * 2. Open URL
 *  * 3. Print the title of the page
 *  * 4. Print the current url
 *  * 5. Print the page source
 *  * 6. Enter the email to email field
 *  * 7. Enter the password to password field
 *  * 8. Close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl="https://www.saucedemo.com/";
        //launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //open the url into the Browser
        driver.get(baseUrl);
        // Maximise the browser
        driver.manage().window().maximize();
        //get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // get current url
        driver.getCurrentUrl();
        //print current url
        System.out.println("Current Url :" + driver.getCurrentUrl());
        // get the page source
        System.out.println("Page source :" + driver.getPageSource());
        //enter the username
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("Admin125@gmail.com");
        // Enter the Password into the password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin125");
        //close the browser
        driver.close();

    }
}
