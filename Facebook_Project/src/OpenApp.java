import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenApp {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("This is Facebook");
	}
}
