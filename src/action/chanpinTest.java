package action;

import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import chanzhi.BaseTest;

public class chanpinTest extends BaseTest{

	@Test
	//��¼�����̳ǣ���Ʒ��ά����Ŀ�����ز�Ʒ�б�
	public void one() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'ά����Ŀ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,' ���ز�Ʒ�б�')]")).click();
		assertTrue(driver.getPageSource().contains("ά����Ŀ"));
	}
	@Test
	//��Ʒ�б�ҳ����������У��
	public void two() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='searchWord']")).sendKeys("aaa");
	    driver.findElement(By.xpath("//input[@id='submit']")).click();
	    assertTrue(driver.getPageSource().contains("aaa"));
	}
	@Test
	//��Ӳ�Ʒ��У��
	public void three() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.className("chosen-choices")).click();
	    driver.findElement(By.className("active-result")).click();;
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("�����");
//	    driver.findElement(By.xpath("//input[@id='submit']")).click();
	    driver.findElement(By.xpath(".//*[@id='submit']")).click();
	    Thread.sleep(3000);
//	    assertTrue(driver.getPageSource().contains("���鲻��Ϊ��"));  
	}
	@Test
	//��Ʒ�б�ҳ��ı༭�����ӵ�У��
	public void four() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=product&f=edit&productID=2']")).click();
	    assertTrue(driver.getPageSource().contains("�༭��Ʒ"));
	}
	@Test
	//��Ʒ�б�ҳ��ĸ��೬���ӵ�У��
	public void five() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		driver.findElement(By.linkText("����")).click();
	    assertTrue(driver.getPageSource().contains("ɾ��"));
	}
	@Test
	//��Ʒ�б�ҳ��ĸ��೬���ӵ�ɾ�������У��
	public void five_d() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		driver.findElement(By.linkText("����")).click();
		driver.findElement(By.linkText("ɾ��")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	    assertTrue(driver.getPageSource().contains("ɾ��"));
	}
	@Test
	//��Ʒ�б�ҳ��Ĳ��ֳ����ӵ��ϲ�ͨ�������У��
	public void six() throws InterruptedException{
		login("admin","admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'��Ʒ')]")).click();
		driver.findElement(By.linkText("����")).click();
		driver.findElement(By.linkText("�ϲ�ͨ��")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("blocks")).click();	
		Select s = new Select(driver.findElement(By.id("blocks")));
		Thread.sleep(2000);
		s.selectByValue("2");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
	    assertTrue(driver.getPageSource().contains("��Ʒ�б�"));
	}
	
}
