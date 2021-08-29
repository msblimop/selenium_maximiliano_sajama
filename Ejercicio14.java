import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Ejercicio14 {
    @Test
    public void netflixPageTest(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com/ar/");

        //Mostrar los elementos h1 y h2 que hay en el sitio
        List<WebElement> listaH1s = driver.findElements(By.tagName("h1"));
        System.out.println("************** Elementos H1 **************");
        for (WebElement elementoH1 : listaH1s){
            System.out.println(elementoH1.getText());
        }

        List<WebElement> listaH2s = driver.findElements(By.tagName("h2"));
        System.out.println("************** Elementos H2 **************");
        for (WebElement elementoH2 : listaH2s){
            System.out.println(elementoH2.getText());
        }

        //Refrescar la página
        driver.navigate().refresh();

        //Mostrar el texto de los botones que se encuentran en la página
        List<WebElement> listaButtons = driver.findElements(By.tagName("button"));
        for (WebElement button : listaButtons){
            if(!button.getText().isEmpty()){
                System.out.println("Button => " + button.getText());
            }
        }

        //Mostrar la cantidad de elementos div que contiene el sitio
        List<WebElement> listaDivs = driver.findElements(By.tagName("div"));
        System.out.println("Total de elementos div: " + listaDivs.size());

        //Obtener y mostrar el título de la página
        System.out.println("Titulo de la página: " + driver.getTitle());

        //Mostrar la cantidad de elementos de tipos link
        List<WebElement> listaLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total de elementos de tipos link: " + listaLinks.size());

        driver.close();
    }
}
