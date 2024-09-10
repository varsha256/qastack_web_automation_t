package common;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    public ExtentReports extent;
    public ExtentTest test;
    public ExtentSparkReporter sparkReporter;

    @BeforeClass
    public void setUp() {
        // Initialize Extent Report
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/SparkReport.html");
        sparkReporter.config().setDocumentTitle("Automation Report");
        sparkReporter.config().setReportName("Google Search Test");
        sparkReporter.config().setTheme(Theme.STANDARD);

        // Initialize ExtentReports
        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("Host Name", "Localhost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("User", "TestUser");

        // Initialize WebDriver
//        driver = new SafariDriver();
    }

    @AfterClass
    public void tearDown() {
        // Close browser
        if (driver != null) {
            driver.quit();
        }
        // Generate the report
        extent.flush();
    }
}


