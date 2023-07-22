package demo;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
///
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class TestCases {
   static ChromeDriver driver;

    public static ChromeDriver TestCasesInitializer() {
        System.out.println("Driver initialization");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;

    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }
        
        public void testCase01() throws InterruptedException{
            Goodreads Goodreads = new Goodreads();
            Goodreads.Search_Goodreads();
        
            // Negivagte to URL
            driver.get("https://www.goodreads.com/");
        
           driver.findElement(By.xpath("//*[@id='signIn']/div/div/a")).click();
           driver.findElement(By.xpath("//*[@id='choices']/div/a[5]/button")).click();
           Thread.sleep(2000);

           driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("***@**.**");
           Thread.sleep(2000);

           driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("*****");
           Thread.sleep(2000);

           driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
           Thread.sleep(2000);

           driver.findElement(By.xpath("//header//input[@name='q']")).sendKeys("Charitrahin");
           Thread.sleep(2000);

           driver.findElement(By.xpath("/html/body/div[2]/div/header/div[2]/div/div[2]/form/button")).click();
           Thread.sleep(3000);

           driver.findElement(By.xpath("//button[@class='wtrToRead']/span[1]")).click();
           Thread.sleep(3000);

           driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/header/div[2]/div/nav/ul/li[2]/a")).click();

           driver.findElement(By.xpath("//*[@id='booksBody']/tr[1]/td[26]/div/div/a/img")).click();
           WebDriverWait wait = new WebDriverWait(driver, 10);
           wait.until(ExpectedConditions.alertIsPresent());

         // Switch to the Alert and accept it
         Alert alert = driver.switchTo().alert();
         alert.accept();
    
         Thread.sleep(3000);
           
         driver.findElement(By.xpath("//header/div[2]/div/div[3]/ul/li[5]/div/a/span/img")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//header/div[2]//div[3]/ul/li[5]//div/ul/li[13]/a")).click();
         Thread.sleep(2000);
       }


        
}
