package StepDefination;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class loginStepDefination {

	 WebDriver driver;

	@Given("^user is already on Login page$")
	public void user_is_already_on_Login_Page() {
		//WebDriver driver = null;
		WebDriverManager.chromedriver().version("80.0.3987.106").setup();
		System.getProperty("webdriver.chrome.driver", "F:\\Downloads\\chromedriver801.exe");
		driver = new ChromeDriver();
		driver.get("https://freecrm.co.in/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}

	@When("^Title of login page is Cogmento CRM$")
	public void title_of_login_page_is_Cogmento_CRM() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = null;
		try {
			title = driver.getTitle();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(title);
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
	}

		@Then("^User enters \"(.*)\" and \"(.*)\"$")
		public void user_enters_username_and_password(String username, String password) {
			driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			
			}

	@Then("^User clicks on Login button$")
	public void user_clicks_on_Login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);

	}

	@Then("^User is on HomePage$")
	public void user_is_on_HomePage() {
		String title = driver.getTitle();
		System.out.println("Home page title::" + title);
		Assert.assertEquals("Cogmento CRM", title);
		driver.quit();

	}

}
