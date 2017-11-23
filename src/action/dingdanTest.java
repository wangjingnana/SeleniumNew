package action;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import chanzhi.BaseTest;

public class dingdanTest extends BaseTest{

		@Test
		public void one() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'订单')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'待收货')]")).click();
			assertTrue(driver.getPageSource().contains("退款"));
		}
		@Test
		public void two() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'订单')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(@href,'/chanzhieps/www/admin.php?m=order&f=refund&orderID=2')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='sn']")).sendKeys("111");
			driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("111");
			driver.findElement(By.id("comment")).sendKeys("111");
			driver.findElement(By.xpath("//input[@id='submit']")).click();
		}
		@Test
		public void three() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'订单')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("删除")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
			assertTrue(driver.getPageSource().contains("2"));
		}
}
