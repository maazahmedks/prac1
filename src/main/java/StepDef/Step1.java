package StepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Step1 {

    WebDriver driver;

    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Maaz\\IdeaProjects\\Sampletestmaven_cucumber\\src\\main\\resources\\Chrome\\chromedriver3.exe");
          driver = new ChromeDriver();
          driver.get("https://www.facebook.com/");
    }

    @When("^User Navigate to LogIn Page \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_Navigate_to_LogIn_Page(String email,String pass) {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(pass);
        driver.findElement(By.id("loginbutton")).click();
    }

    @Then("^Message displayed not Login Successfully$")
    public void message_displayed_Login_Successfully() {
        String str=driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText();
System.out.println("Error:"+str);
        Assert.assertEquals(str,"The email address that you've entered doesn't match any account. Sign up for an account.");
    }



    @When("^User Navigate to LogIn Page invalid$")
    public void user_Navigate_to_LogIn_Page2() {
       // driver.navigate().back();
        driver.findElement(By.id("email")).sendKeys("ahmed.maaz@hotmail.co.uk");
        driver.findElement(By.id("pass")).sendKeys("fakepass");
        driver.findElement(By.id("loginbutton")).click();
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully2() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        String str2=driver.findElement(By.xpath("//*[@id=\"navItem_4748854339\"]/a/div")).getText();
        System.out.println("Error2:"+str2);

        System.out.println("repo2");

        Assert.assertEquals(str2,"News Feed");
    }


}
