package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonPage{
    // constructor
    public HomePage(WebDriver driver) {
        super(driver);  // driver herdado de CommoPage - super classe
        PageFactory.initElements(driver, this);
    }

    // elementos mapeados
    // mapeamento para os combos Origem e Destino
    public By byLocal(String local){
        return By.cssSelector("option[value=\"" + local + "\"]");
        // toda vez que tem \", a " será ignorada na 1a vez
        // mas elas será usada na 2a vez
        // fica assim na execução: option[value="Rome"]
    }

    @FindBy(css = ".btn-primary")
    //@FindBy(css = "input[value]")
    WebElement btnFindFlights;

    // ações com os elementos mapeados
    public void selecionarOrigemDestino(String byOrigem, String byDestino) {
        driver.findElement(byLocal(byOrigem)).click();
        driver.findElement(byLocal(byDestino)).click();
    }

    public void clicarBotaoFindFlights() {
        btnFindFlights.click();
    }

    public void acessarHomePage(String url) {
        driver.get(url);

    }

}



