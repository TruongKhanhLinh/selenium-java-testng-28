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
		//tìm kiếm trên dev tool bằng id: //input[@id="email"] rồi nhập text truongkhanhlinh@gmail.com
		driver.findElement(By.id("email")).sendKeys("truongkhanhlinh@gmail.com");
	}

	@Test
	public void TC_02_Class() {
		//tìm kiếm trên dev tool bằng class: //input[@class="input-text required-entry validate-email"], //div[@class="col-2 registered-users"]
		
		//tìm element trên dev tool: //button[@class="button search-button"]
		driver.findElement(By.className("search-button"));
	}

	@Test
	public void TC_03_Name() {
		driver.findElement(By.name("login[username]"));
	}
	
	@Test
	public void TC_04_Tagname() {
		//verify xem 1 page có bao nhiêu element giống nhau: link, button, radio, textbox
		driver.findElements(By.tagName("a")); //ít khi dùng
	}
	
	@Test
	public void TC_05LinkText() {
		//chỉ dùng được với Link
		//lấy tuyệt đối cả text
		driver.findElement(By.linkText("SEARCH TERMS"));
	}
	
	@Test
	public void TC_06_Partial_LinhText() {
		//chỉ dùng được với Link
		//lấy tương đối
		driver.findElement(By.partialLinkText("TERMS"));
	}
	
	@Test
	public void TC_07_Css() {
		//CSS với id: input#email
		driver.findElement(By.cssSelector("input#email"));
		
		//CSS với class: .new-users
		driver.findElement(By.cssSelector(".new-users")); //lấy 1 phần trong class
		//
		
		//CSS với name input[name='login[password]']
		driver.findElement(By.cssSelector("input[name='login[password]']"));
		
		//CSS với tagname: truyền tên thẻ
		driver.findElement(By.cssSelector("input"));
		
		//CSS với link
		driver.findElement(By.cssSelector("a[title='Search Terms']"));
		
		//CSS với partial link
		driver.findElement(By.cssSelector("a[title*='Terms']"));
	}
	
	// cú pháp tìm kiếm css trên dev tool: tagname[attribute_name='Attribute_value']
	// cú pháp tìm kiếm xpath trên dev tool: //tagname[@attribute_name='Attribute_value']
	
	@Test
	public void TC_08_Xpath() {
		//Xpath với id: input#email
		driver.findElement(By.xpath("//input[@id='email']"));
				
		//Xpath với class: div.new-users
		driver.findElement(By.xpath("//div[@class='col-1 new-users']"));

		//Xpath với name input[name='login[password]']
		driver.findElement(By.xpath("//input[@name='login[password]']"));

		//Xpath với tagname: truyền tên thẻ
		driver.findElement(By.xpath("//input"));

		//Xpath với link
		driver.findElement(By.xpath("//a[@title='Search Terms']"));
									// //a[text()='Search Terms']

		//Xpath với partial link
		driver.findElement(By.xpath("//a[contains(@title,'Advanced')]"));
									// //a[contains(text(),'Advanced')]
	}

	@AfterClass
	public void afterClass() {
		//driver.quit();
	}
}