package cucumberDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefiniationDemo {
	WebDriver driver;
	@Given("^openbrower$")
	public void openbrower() throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\peal9\\Downloads\\chromedriver_win32\\chromedriver.exe");	
    driver= new ChromeDriver();
	}

	@Given("^navigate to url$")
	public void navigate_to_url() throws Throwable {
     driver.get("https://www.eshopper24.com/");
     driver.manage().window().maximize();
	}

	@When("^user click on menu$")
	public void user_click_on_menu() throws Throwable {
    driver.findElement(By.xpath("//ul[@class='category-navigation-list sticky-flyout']//li[1]")).click();
	}

	@When("^user click on slik saree$")
	public void user_click_on_slik_saree() throws Throwable {
    driver.findElement(By.xpath("//img[@title='Show details for Silk & Cotton Mixed Saree - TSG-1464']")).click();
	}

	@When("^user click on first product$")
	public void user_click_on_first_product() throws Throwable {

	}

	@When("^click buy now$")
	public void click_the_color() throws Throwable {
    driver.findElement(By.id("add-to-cart-button-3131")).click();
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
    driver.quit();
	}
	@When("^user click katan sare$")
	public void user_click_katan_sare() throws Throwable {
	    driver.findElement(By.xpath("//ul[@class='category-navigation-list sticky-flyout']//li[5]")).click();
	}

	@When("^user click sceond one$")
	public void user_click_sceond_one() throws Throwable {
	    driver.findElement(By.xpath("//img[@title='Show details for Buty Katan Saree - TSG - 17054']")).click();
	    driver.navigate().back();
	}

	@When("^user click one first one$")
	public void user_click_one_first_one() throws Throwable {
	  driver.findElement(By.xpath("//img[@title='Show details for Buty Katan Saree - TSG - 17040']")).click();
	  driver.getTitle().equals("https://www.eshopper24.com/tangail-saree-tsg-17040");
	}

}
