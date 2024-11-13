package pages;

import org.openqa.selenium.WebDriver;

public class CommonPage {
    
    public WebDriver driver; 

    // construtor - conecta o exterior com o interior da classe
    public CommonPage(WebDriver driver){
        this.driver = driver;
    }

    public String lerNomeDaGuia() {
        return driver.getTitle();   // lê o título da guia/ página
    }
    
}
