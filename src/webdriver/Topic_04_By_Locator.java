package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_04_By_Locator {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String osName = System.getProperty("os.name");

	@BeforeClass
	public void beforeClass() {
		if (osName.contains("Windows")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
		} else {
			System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver");
		}

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://live.techpanda.org/index.php/customer/account/login/");
	}
	//<input type="email" autocapitalize="off" autocorrect="off" spellcheck="false" name="login[username]" value="" id="email" class="input-text required-entry validate-email" title="Email Address">
	//html
		//1: Tên thẻ - tagname
		//2: Tên thuộc tính - attribute name: type, name, id, class, ...
		//3: Giá trị thuộc tính - Attribute value: email, login, input text
	
	//dùng giá trị thuộc tính là duy nhất
	@Test
	public void TC_01_ID() {
		//tìm kiếm trên dev tool bằng id: //input[@id="email"]
		driver.findElement(By.id("email")).sendKeys("truongkhanhlinh@gmail.com");
	}

	@Test
	public void TC_02_Class() {
		//tìm kiếm trên dev tool bằng class: //input[@class="input-text required-entry validate-email"], //div[@class="col-2 registered-users"]
		
	}

	@Test
	public void TC_03_Name() {
		
	}
	
	@Test
	public void TC_04_Tagname() {
		
	}
	
	@Test
	public void TC_05LinkText() {
		
	}
	
	@Test
	public void TC_06_Partial_LinhText() {
		
	}
	
	@Test
	public void TC_07_Css() {
		
	}
	
	@Test
	public void TC_08_Xpath() {
		
	}

	@AfterClass
	public void afterClass() {
		//driver.quit();
	}
}