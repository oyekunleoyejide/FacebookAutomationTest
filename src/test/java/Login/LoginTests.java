package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //import the selenium webDriver
    private WebDriver driver;

    //import chromeDriver
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        //input project URL = Facebook login URL
        driver.get("https://web.facebook.com/login/");

        //waiting for globally
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //maximise the window
        driver.manage().window().maximize();
        //get page title
        System.out.println(driver.getTitle());

        //Locate username field
        driver.findElement(By.id("email")).sendKeys("bobbykay7");

        //Locate password field
        driver.findElement(By.id("pass")).sendKeys("holyspirit17");

        //Click on sign in button
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[3]/button")).click();


        Thread.onSpinWait();
        //close the  after test
        driver.quit();
    }


    //initiate the test run command
    public static void main (String[] args) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();
    }

}
