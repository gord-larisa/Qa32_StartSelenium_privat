import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class StartPhoneBook {
    WebDriver wd;
    @Test
    public void startPhoneBook(){
        wd=new ChromeDriver();
        //wd.get("https://contacts-app.tobbymarshall815.vercel.app");// open
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");//open www+history of steps
        // eto dva metoda
        wd.manage().window().maximize();
        //steps of test login

        // open login form ------find loginbtn+click------> open form login
        WebElement el = wd.findElement(By.id("idel"));
        List<WebElement> list=wd.findElements(By.id("idel"));
        
        //fill email      -------find email element+click+clear+type email
        //fill password   -------find password element+click+clear+clear+type password
        //click login btn -------find login element+click


        //assert






        //wd.close()// close one tab
        wd.quit();//close all tabs

    }
}
