import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class StartPhoneBook {
    WebDriver wd;
    @Test
    public void startPhoneBook() {
        wd = new ChromeDriver();
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

        wd.close();// close one tab
        wd.quit();//close all tabs

        //home work
    }
      @Test

       public void home(){
            wd=new ChromeDriver();
            wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");//open www+history of steps
            wd.manage().window().maximize();

            WebElement el1=wd.findElement(By.tagName("body"));
            WebElement el2=wd.findElement(By.tagName("div"));
            WebElement el3=wd.findElement(By.tagName("h1"));
            WebElement el4=wd.findElement(By.tagName("a"));
            WebElement el5=wd.findElement(By.tagName("input"));
            WebElement el6=wd.findElement(By.tagName("button"));
            WebElement el7=wd.findElement(By.tagName("br"));

            WebElement el8=wd.findElement(By.id("root"));

            WebElement el9=wd.findElement(By.className("container"));
            WebElement el10=wd.findElement(By.className("active"));
            WebElement el11=wd.findElement(By.className("navbar-component_nav__1X_4m"));
            WebElement el12=wd.findElement(By.className("login_login__3EHKB"));

            WebElement el13 =wd.findElement(By.linkText("HOME"));
            WebElement el14 =wd.findElement(By.linkText("ABOUT"));
            WebElement el15 =wd.findElement(By.linkText("LOGIN"));

            WebElement e16 =wd.findElement(By.partialLinkText("HO"));


          wd.close();// close one tab
          wd.quit();//close all tabs
    }

    @Test
    public void cssLocatorsTest(){
        wd=new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");//open www+history of steps
        wd.manage().window().maximize();

        //standart start for cssSelector

        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.cssSelector("a"));

              //class   .
        wd.findElement(By.cssSelector(".login_login__3EHKB"));

                //id   #
        wd.findElement(By.cssSelector("#root"));

                //attribute []
        wd.findElement(By.cssSelector([href="login"]));
        

    }




}
