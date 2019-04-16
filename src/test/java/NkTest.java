import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NkTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://nk.pl/logowanie");

        WebElement goToServiceButton = driver.findElement(By.cssSelector("body > div.cmp-app_gdpr > div.cmp-popup_popup > div.cmp-popup_content > div > div.cmp-intro_options > button.cmp-button_button.cmp-intro_acceptAll"));

        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(goToServiceButton));

        goToServiceButton.click();

        WebElement emailInput = driver.findElement(By.id("login"));

        emailInput.sendKeys("marysiaa90@o2.pl");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("dupa");

        WebElement loginButton = driver.findElement(By.cssSelector("#main-content > div.grid.u-p_relative > div.grid-item.grid-item--1of1.grid-item--xl_3of5 > article > div > form > div:nth-child(3) > button"));
        loginButton.click();

        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
    }
}
