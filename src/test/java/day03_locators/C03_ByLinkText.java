package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.transform.sax.SAXResult;
import java.time.Duration;

public class C03_ByLinkText {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        driver.get("https://www.amazon.com.tr");

        WebElement giftcardLinki= driver.findElement(By.linkText("Hediye Kartları"));
        giftcardLinki.click();

        String expextedKelime="Hediye Kartları";
        String actualTitle= driver.getTitle();

        if (actualTitle.contains(actualTitle)){
            System.out.println("Gift Card testi PASSED");
        }else{
            System.out.println("Gift Card testi FAILED");
        }

        driver.close();

    }
}
