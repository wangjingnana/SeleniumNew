package action;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import chanzhi.BaseTest;

public class dingdan_shangpinTest extends BaseTest{

		@Test
		//�̳ǡ����������ջ������ӵ����У��
		public void one() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'����')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'���ջ�')]")).click();
			assertTrue(driver.getPageSource().contains("�˿�"));
		}
		@Test
		//���鳬���ӵĵ����У��
		public void two() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'����')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='/chanzhieps/www/admin.php?m=order&f=view&orderID=2&btnLink=false']")).click();
			Thread.sleep(2000);
			assertTrue(driver.getPageSource().contains("��Ʒ��Ϣ"));
		}
		@Test
		//ɾ�������ӵĵ����У��
		public void three() throws InterruptedException{
			login("admin","admin");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(.,'�̳�')]")).click();
			driver.findElement(By.xpath("//a[contains(.,'����')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("ɾ��")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
			assertTrue(driver.getPageSource().contains("2"));
		}
}
