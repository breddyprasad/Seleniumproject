package ScenariotoAutomate;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*
 1  Type the main method
 2  Lunching the firefox browser 
 3  Open the website // https://www.google.com
 4  Print the display massage  is open the website is successfully
 5  wait 5 seconds
 6  print the get title() and title length()
 7  print the get current url() and current url length()
 8  print the get page source()
 9  print the 
 */
public class WebDriveCommends {
	public static void main(String[] args) {
		String url="https://www.google.com";
	
	WebDriver driver= new FirefoxDriver();
	driver.get(url);
	
	System.out.println("successfully open the website www.google.com");
	try {
		Thread.sleep(5);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String title=driver.getTitle();
	
	//these is  title and  length
	
	int titlelength=driver.getTitle().length();
	
	System.out.println("title of the page is "+title);
	System.out.println(" length of the page titlre "+titlelength);
	
	// these is the  Current url and length 
	String Actualurl=driver.getCurrentUrl();
	if (Actualurl.equals(url)) {
		System.out.println("Verifications succssfully - The Current url will be open ");
		}
	else
	{
		System.out.println("Verifications faild -The current url will  be not open");
	System.out.println("Actualurl is "+Actualurl);
	System.out.println("Expected url is "+ url);
	}
	String pagesources=driver.getPageSource();
	int pageSourceLength = pagesources.length();
	
	System.out.println("totle length of the pagesourcelength="+pageSourceLength);
	driver.close();
	
	}
	

}
