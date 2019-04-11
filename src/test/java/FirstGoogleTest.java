import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstGoogleTest {

    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//        https://chromedriver.storage.googleapis.com/index.html?path=73.0.3683.68/

        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.duck.com");
        WebElement searchBar = driver.findElement(By.id("search_form_input_homepage"));

        searchBar.sendKeys("Gosia Ksiądz");

        Thread.sleep(5000);

        WebElement searchButton = driver.findElement(By.id("search_button_homepage"));
        searchButton.click();

        Thread.sleep(5000);

        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }
}
