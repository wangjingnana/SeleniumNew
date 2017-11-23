package action;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import chanzhi.BaseTest;

public class dingdan_shangpinTest extends BaseTest{

		@Test
		//商城、订单、待收货超链接点击的校验
		public void one() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'订单')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'待收货')]")).click();
			assertTrue(driver.getPageSource().contains("退款"));
		}
		@Test
		//详情超链接的点击的校验
		public void two() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'订单')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=order&f=view&orderID=2&btnLink=false']")).click();
			Thread.sleep(2000);
			assertTrue(driver.getPageSource().contains("商品信息"));
		}
		@Test
		//删除超链接的点击的校验
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
