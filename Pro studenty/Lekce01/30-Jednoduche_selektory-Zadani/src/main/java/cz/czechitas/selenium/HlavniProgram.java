package cz.czechitas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class HlavniProgram {

    public void run() throws Exception {
//      System.setProperty("webdriver.gecko.driver", System.getProperty("user.home") + "/Java-Training/Selenium/geckodriver");
        System.setProperty("webdriver.gecko.driver", "C:\\Java-Training\\Selenium\\geckodriver.exe");

        WebDriver prohlizec;
        prohlizec = new FirefoxDriver();
        prohlizec.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        prohlizec.navigate().to("https://automation-playground.czechitas.repl.co/");

        // TODO: Sem vepiste svuj program

        Thread.sleep(10_000);

        prohlizec.quit();
    }
}
