package DemoWebShopPaymentOption;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.remote.MobileCapabilityType;
  @Test
  public class DemoWebShopClass {
	  WebDriver driver;

	  public void loginApplication() throws InterruptedException {
	      driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("Ashokgupta19812022@gmail.com");
	      driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("Agupta@19812022");
	      driver.findElement(By.xpath("//*[@value='Log in']")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.xpath("//*[@id=\"mob-menu-button\"]")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[2]/li[2]/span")).click();
	      Thread.sleep(3000);   
	      driver.findElement(By.linkText("Desktops")).click(); 
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/h2/a")).click();
	      driver.findElement(By.className("button-2 estimate-shipping-button")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
	      Thread.sleep(3000);     
	      driver.findElement(By.className("button-1 new-address-next-step-button")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.className("button-1 new-address-next-step-button")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.className("button-1 new-address-next-step-button")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.className("button-1 new-address-next-step-button")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.className("button-1 new-address-next-step-button")).click();
	      Thread.sleep(5000);
	      driver.findElement(By.className("button-1 new-address-next-step-button")).click();
	      Thread.sleep(5000);
	      String expected="Your order has been successfully processed!";
	      String actual=driver.findElement(By.linkText("Your order has been successfully processed!")).getText();
	      Assert.assertEquals(actual, expected);
	  }
	  @BeforeClass
	  public void lauchBrowser() throws MalformedURLException {
	      ChromeOptions browserOptions= new ChromeOptions();
	      browserOptions.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	      browserOptions.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone_x86");
	      browserOptions.setCapability("unicodeKeyboard", true);
	      browserOptions.setCapability("resetKeyboard", true);
	      driver= new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), browserOptions);
	      driver.get("http://demowebshop.tricentis.com/login");
	     
	  }
	  @AfterClass
	  public void closeBrowser() {
	      driver.close();
	      
	  }
  
}
