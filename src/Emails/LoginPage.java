package Emails;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	ProfilesIni profile = new ProfilesIni();
	FirefoxProfile myprofile=profile.getProfile("default");
	WebDriver driver=new FirefoxDriver(myprofile);
	WebDriverWait wait = new WebDriverWait(driver, 25);
@Before
public void OpenAccount(){	
	
	driver.get("http://gmail.com");
	driver.findElement(By.id("Passwd")).sendKeys("whisky850203");
	driver.findElement(By.id("next")).click();
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Passwd")));
}
@Test
public void SearchSeartunBrief(){
	driver.findElement(By.id("signIn")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	assertTrue("",driver.findElement(By.cssSelector("div.T-I.J-J5-Ji.T-I-KE.L3")).isEnabled());
	WebElement unreadEmail=driver.findElement(By.xpath("//*[contains(text(),'unread')]"));
if(unreadEmail.isEnabled())
	{
	if(driver.findElement(By.xpath("//*[contains(text(),'UniCredit Bulbank')]")).isEnabled()){
		driver.findElement(By.xpath("//span[contains(text(),'UniCredit Bulbank')]")).click();
	}
	};	
}
}
