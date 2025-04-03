package AzureDevopsPractice.DevopsAutomationTest2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nileshazuredevops.azurewebsites.net/webapp/");
		String firsttext=driver.findElement(By.tagName("h1")).getText();
		System.out.println(firsttext);
		Assert.assertEquals(firsttext, "Nilesh Azure Devops Learning");

	}

}



