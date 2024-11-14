package stepsPO;

import pages.Base;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
    Base base;

    // construtor
    public Hooks(Base base){
        this.base = base;
    }

    @Before
    public void iniciarPO(){
        //WebDriverManager.chromedriver().setup();
        base.driver = new ChromeDriver();
        base.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(60000));
        base.driver.manage().window().maximize();

    }
    @After
    public void finalizarPO(){
        base.driver.quit();
    }

}