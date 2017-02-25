package ScenariotoAutomate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/* 
  Create a class  
  Create a main method
  Lunching the firefox browser 
  open the website http://www.google.com
  print the message to display that the website is opened successfully
  wait the 5 second 
  close the browser
    
     */
public class Lunching {
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		
		System.out.println("successfully open the website www.google.com");
		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
	}

}
