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
        //WebElement el = wd.findElement(By.id("idel"));// example
        //List<WebElement> list=wd.findElements(By.id("idel"));//example

        List<WebElement> Elements = wd.findElements(By.tagName("a"));
        WebElement login = Elements.get(2);
        login.click();

        WebElement element = wd.findElement(By.id("root"));
        WebElement element1 = wd.findElement(By.className("container"));



        //fill email      -------find email element+click+clear+type email
        //fill password   -------find password element+click+clear+clear+type password
        //click login btn -------find login element+click


        //assert






        //wd.close()// close one tab
       // wd.quit();//close all tabs



        //home work
        @Test
        public void startPhoneBook(){
            wd=new ChromeDriver();
            wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");//open www+history of steps
            wd.manage().window().maximize();


            WebElement element = wd.findElement(By.id("root"));
            WebElement element1 = wd.findElement(By.className("container"));



            

    }
}
