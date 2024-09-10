package search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import common.BaseTest;
import org.openqa.selenium.safari.SafariDriver;
public class Search extends BaseTest {

//WebDriver driver ;


    @Test
    public void testGoogleSearch() throws InterruptedException {
        test = extent.createTest("Google Search Test", "Verifies the search results after entering a valid query");
        driver = new SafariDriver();
        // Step 1: Navigate to Google
        driver.get("https://www.google.com");
        test.pass("Navigated to Google homepage");

        // Step 2: Enter search term and press Enter
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.sendKeys(Keys.RETURN);
        test.pass("Entered search term 'Selenium WebDriver' and pressed Enter");
        Thread.sleep(1000);
        // Step 3: Wait for the results to load and verify results page
        WebElement resultsDiv = driver.findElement(By.id("search")); // Results container on Google
        Assert.assertTrue(resultsDiv.isDisplayed(), "Search results are displayed");
        test.pass("Search results are successfully displayed");

        // Step 4: Verify the title contains the search term
        String pageTitle = driver.getTitle();
        Assert.assertTrue(pageTitle.contains("Selenium WebDriver"));
        test.pass("Page title contains 'Selenium WebDriver'");
    }


}
