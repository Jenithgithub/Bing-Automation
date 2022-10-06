package bingautomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tfaw {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tfaw.com/");
		Thread.sleep(2000);

		WebElement toys= driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/li[5]"));
		toys.click();
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("scroll(0,800)");
		Thread.sleep(4000);
		
		WebElement hulktoyaddcartbutton= driver.findElement(By.xpath("(//button[@class='action tocart secondary'])[14]"));
		hulktoyaddcartbutton.click();
		
		Thread.sleep(5000);
        WebElement checkoutbutton= driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']"));
        checkoutbutton.click();
        Thread.sleep(5000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,300)");
        
        WebElement emailaddress= driver.findElement(By.id("customer-email"));
        emailaddress.sendKeys("testid@gmail.com");
        Thread.sleep(5000);
        
        WebElement firstname= driver.findElement(By.xpath("(//input[@name='firstname'])[1]"));
        firstname.sendKeys("Tester");
        
        WebElement lastname= driver.findElement(By.xpath("(//input[@name='lastname'])[2]"));
        lastname.sendKeys("testerrr");
        
        WebElement address= driver.findElement(By.xpath("(//input[@name='street[0]'])[2]"));
        address.sendKeys("959 Freedom Ln");
        
        WebElement city= driver.findElement(By.xpath("(//input[@name='city'])[1]"));
        city.sendKeys("Leonard");
        
        WebElement postcode= driver.findElement(By.xpath("(//input[@name='postcode'])[1]"));
        postcode.sendKeys("48367");
        
        WebElement selectstate= driver.findElement(By.xpath("(//select[@name='region_id'])[1]"));
        selectstate.click();
        Thread.sleep(2000);
        WebElement Michigan= driver.findElement(By.xpath("(//option[@value='101'])[1]"));
        Michigan.click();
        
        WebElement phonenumber= driver.findElement(By.xpath("(//input[@name='telephone'])[1]"));
        phonenumber.sendKeys("3606543000");
        
        WebElement samebillingaddress= driver.findElement(By.xpath("(//input[@name='billing-address-same-as-shipping'])[1]"));
        samebillingaddress.click();
        Thread.sleep(4000);
        
        WebElement optionlast= driver.findElement(By.xpath("(//input[@name='ko_unique_11'])[1]"));
        optionlast.click();
        Thread.sleep(6000);
        
        WebElement addcoupon= driver.findElement(By.xpath("(//span[@id='block-discount-heading'])[1]"));
        addcoupon.click();
        Thread.sleep(2000);
        WebElement couponfield= driver.findElement(By.xpath("(//input[@name='discount_code'])[1]"));
        couponfield.click();
        
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        WebElement applycoupon= driver.findElement(By.xpath("(//button[@value='Apply Discount'])[1]"));
        applycoupon.click();
        //robot.keyPress(KeyEvent.VK_TAB)
        //robot.keyRelease(KeyEvent.VK_TAB)
	}

}
