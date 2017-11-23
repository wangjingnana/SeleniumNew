package action;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import chanzhi.BaseTest;

public class dingdan_jifenTest extends BaseTest{

	@Test
	//商城、订单、积分超链接点击的校验
	public void jifen() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'订单')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'积分')]")).click();
		assertTrue(driver.getPageSource().contains("商品信息"));
	}
	@Test
	//商城、订单、积分、待发货超链接点击的校验
	public void daifahuo() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'订单')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'积分')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'待发货')]")).click();
		assertTrue(driver.getPageSource().contains("类型"));
	}
}