package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Goodreads {
    ChromeDriver driver;
     public void Search_Goodreads() {


        this.driver = TestCases.TestCasesInitializer();
         // Negivagte to URL
        driver.get("https://www.google.com");

        // Click on Search Bar Using Locator "Name" q
        driver.findElementByName("q").click();
       
        // Type in "SearchGoodreads" in search bar Using Locator "Name" q
        driver.findElementByName("q").sendKeys("SearchGoodreads");
       
        // Click on Google Search button Using Locator "XPath" (//input[@value='Google
        // Search'])[1]
        driver.findElementByXPath("(//input[@value='Google Search'])[1]").click();

     }

}
