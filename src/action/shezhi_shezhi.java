package action;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import chanzhi.BaseTest;


public class shezhi_shezhi extends BaseTest{
	//登录后点击商城、设置
	
	@Test
	//输入合法的合作者ID、合作者KEY、支付宝邮箱
	public void shezhiTestsuccess() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=product&f=setting']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("pid")).sendKeys("2088111123453432");
		driver.findElement(By.id("key")).sendKeys("aaa111364h6jd8fkaaa111364h6jd8fk");
		driver.findElement(By.id("email")).sendKeys("727366326@qq.com");
		driver.findElement(By.id("submit")).click();
	}
	@Test
	//输入非法的合作者ID,合法合作者KEY、支付宝邮箱
	public void shezhiTestfail() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=product&f=setting']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("pid")).sendKeys("20881");
		driver.findElement(By.id("key")).sendKeys("aaa111364h6jd8fkaaa111364h6jd8fk");
		driver.findElement(By.id("email")).sendKeys("727366326@qq.com");
		driver.findElement(By.id("submit")).click();
		assertTrue(driver.getPageSource().contains("2088"));
	}
	@Test
	//修改确认收货日期为2天
	public void time() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=product&f=setting']")).click();
		Thread.sleep(3000);
		WebElement time = driver.findElement(By.id("confirmLimit"));
		if(time!=null){
			time.click();
			Actions action = new Actions(driver);
			action.sendKeys(Keys.BACK_SPACE);
			action.sendKeys("2").perform();
		}
		driver.findElement(By.id("submit")).click();
	}
	@Test
	//修改货币为欧元
	public void money() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=product&f=setting']")).click();
		Thread.sleep(3000);
		WebElement money = driver.findElement(By.className("chosen-single"));
		money.click();
		money.sendKeys("欧元");
		Thread.sleep(3000);
		money.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).click();
	}
	@Test
	//库存开启按钮点击的校验
	public void kucunopen() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=product&f=setting']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("stock2")).click();
		driver.findElement(By.id("submit")).click();
	}
	@Test
	//库存关闭按钮点击的校验
	public void kucunclose() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=product&f=setting']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("stock1")).click();
		driver.findElement(By.id("submit")).click();
	}
	@Test
	//交易方式多选框点击的校验
	public void method() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(.,'商城')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=product&f=setting']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("payment1")).click();
		driver.findElement(By.id("payment2")).click();
		driver.findElement(By.id("payment3")).click();
		driver.findElement(By.id("submit")).click();
	}
}
