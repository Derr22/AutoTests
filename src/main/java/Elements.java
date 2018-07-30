import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

    WebDriver driver ;

    String name = "Дерр";

    WebElement RegistrationВutton;
    WebElement NameTextField;

    Elements()
    {
        driver = new ChromeDriver();
        driver.get("https://www.mvideo.ru/");
        //driver.manage().timeouts().implicitlyWait(3,  TimeUnit.SECONDS);
        RegistrationВutton = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[5]/div/div[1]/div[3]/ul/li[2]/a"));
        NameTextField = driver.findElement(By.cssSelector("#register-form-name-input"));
    }
}
