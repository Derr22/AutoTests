import org.graalvm.compiler.nodes.graphbuilderconf.InvocationPlugins;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
    public static Elements elements = new Elements();

    public static void RegistrationFunc() {

        WebDriverWait wait = new WebDriverWait(elements.driver, 5);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#register-form-name-input")));
        elements.NameTextField.sendKeys(elements.name);
    }
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriverWait wait = new WebDriverWait(elements.driver, 5);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[5]/div/div[1]/div[3]/ul/li[2]/a")));
        elements.driver.manage().window().maximize();
        elements.RegistrationВutton.click();
        RegistrationFunc();
    }
}
