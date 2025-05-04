package testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class SeleniumTestCases {

        WebDriver driver;
        // Saving the expected title of the Webpage
        String title = "ToolsQA - Demo Website For Automation";


        @Test(priority=1)
        public void starting_point(){
            System.out.println("This is the starting point of the test");
            //Initialize Chrome Driver
            //driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
            driver = new ChromeDriver();
            driver.get("https://demoqa.com/");
            driver.manage().window().maximize();
        }


        @Test(priority=2)
        public void checkTitle() {
            String testTitle = "DEMOQA";
            String originalTitle = driver.getTitle();
            Assert.assertEquals(originalTitle, testTitle);
        }

        @Test(priority=3)
        public void click_element() {
            driver.findElement(By.xpath("//*[@class='card-body']/h5[text()='Elements']//parent::div")).click();
            System.out.println("Home Page heading is displayed");
        }
    }


