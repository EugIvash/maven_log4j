import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Eugene on 22.03.2015.
 */
public class TestSelenium {
    public static void main(String [] args)
    {
        System.out.println("Hello World!");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.name("login"));
        loginElement.sendKeys("mylogin");

        WebElement passElement = driver.findElement(By.name("password"));
        passElement.sendKeys("mypassword");

        WebElement sendButton = driver.findElement(By.name("commit"));
        sendButton.submit();

        driver.get("https://github.com/new");

        WebElement repositoryName = driver.findElement(By.name("repository[name]"));
        repositoryName.sendKeys("TestSeleniumEugIvash");
        repositoryName.submit();
    }
}
