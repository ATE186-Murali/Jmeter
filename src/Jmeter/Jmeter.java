package Jmeter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jmeter {
	
 	
	public static String name=name();
	
	
	public static String name()
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter your name:   ");
		
		String name=input.nextLine();
		
		return name;
	}
 
	@Test
	public  void user1() throws InterruptedException, ParseException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://agl78:9090/QuaLISWeb/#/login");
		
		driver.findElement(By.xpath("//*[@id='sloginid']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[@id='spassword']")).sendKeys("123");
		
		
		
		for (int i=1; i>0; i++)
		{
			String time=time();
			Thread.sleep(100);
			
			System.out.println(name);
			System.out.println(time);
			
			System.out.println(i+" time checked the time");
			
			if (time.equals(name))
			{
				
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/form/button")).click();
			}
		}
		
		
		
		
	}
	
	@Test
	public  void user2() throws InterruptedException, ParseException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE\\driver\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://agl78:9090/QuaLISWeb/#/login");
		
		driver.findElement(By.xpath("//*[@id='sloginid']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//*[@id='spassword']")).sendKeys("123");
		
		
		
		for (int i=1; i>0; i++)
		{
			String time=time();
			Thread.sleep(100);
			
			System.out.println(name);
			System.out.println(time);
			
			System.out.println(i+" time checked the time");
			
			if (time.equals(name))
			{
				
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/form/button")).click();
			}
		}
		
		
		
		
	}
	
	public static String time() throws ParseException
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH.mm.ss");  
		LocalDateTime now = LocalDateTime.now();  
		
		String time=dtf.format(now);
		
		
         
		return time;
	}
	
	public static void main(String[] args)throws ParseException {
		time();
	}

}
