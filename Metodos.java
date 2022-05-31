package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Metodos {
	WebDriver driver;

	public void abrirNavegador(String appUrl, String descricao) {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
	}

	public void click(By elemento) {

		driver.findElement(elemento).click();
	}

	public void fechaNavegador(String passo) {

		driver.quit();
	}

	public void submti(By elemento) {
		driver.findElement(elemento).submit();

	}

}
