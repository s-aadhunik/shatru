
package web_basic;


import java.*;


import java.util.Scanner;


//import java.util.Scanner.*;


import org.openqa.selenium.*;


import org.openqa.selenium.chrome.*;
 
public class Testing {​​​​


    public static void main(String[] args) 


    {​​​​


       Scanner sc=new Scanner(System.in);


       System.out.println("Enter the value of i");


        int i=sc.nextInt();


        System.setProperty("webdriver.chrome.driver","C:\\Users\\shatrughan_p\\Desktop\\Attachments\\shatrughan DATA\\data E\\Java\\selenium_downloads\\Driver1\\chromedriver.exe");


        WebDriver driver=new ChromeDriver();


        driver.manage().window().maximize();


        switch(i) 


        {​​​​


         case 1:


             driver.get("https://www.manutd.com/en");


         case 2:


            driver.get("https://www.manutd.com/en/videos");


            driver.get("https://www.manutd.com/en/videos/first-team");


            driver.get("https://www.manutd.com/en/videos/womens-team");


            driver.get("https://www.manutd.com/en/videos/reserves");


            driver.get("https://www.manutd.com/en/videos/academy");


            driver.get("https://www.manutd.com/en/videos/club");


         case 3:


            driver.get("https://www.manutd.com/en/news");


            driver.get("https://www.manutd.com/en/news/first-team");


            driver.get("https://www.manutd.com/en/news/women");


            driver.get("https://www.manutd.com/en/news/reserves");


            driver.get("https://www.manutd.com/en/news/academy");


            driver.get("https://www.manutd.com/en/news/club");


         case 4:


            driver.get("https://us.store.manutd.com");


         case 5:


             /*---------------------------First Team Fixture----------------------------------*/


             driver.get("https://www.manutd.com/en/matches/fixtures-results");


             driver.get("https://www.manutd.com/en/matches/first-team/2019-20/all");


             driver.get("https://www.manutd.com/en/matches/first-team/2019-20/premier-league");


             driver.get("https://www.manutd.com/en/matches/first-team/2019-20/fa-cup");


             driver.get("https://www.manutd.com/en/matches/first-team/2019-20/europa-league");


             driver.get("https://www.manutd.com/en/matches/first-team/2019-20/league-cup");


             driver.get("https://www.manutd.com/en/matches/first-team/2019-20/friendly");



             /*---------------------------First Team Table----------------------------------*/


             driver.get("https://www.manutd.com/en/matches/league-table");


             driver.get("https://www.manutd.com/en/matches/first-team/2019-20/premier-league/league-table");


             driver.get("https://www.manutd.com/en/matches/first-team/2019-20/europa-league/league-table");
 
             /*---------------------------Woman Team Fixture------------------------------*/
 
             driver.get("https://www.manutd.com/en/matches/women/2019-20/all");


             driver.get("https://www.manutd.com/en/matches/women/2019-20/fa-womens-super-league");


             driver.get("https://www.manutd.com/en/matches/women/2019-20/fa-womens-continental-league-cup");


             driver.get("https://www.manutd.com/en/matches/women/2019-20/womens-fa-cup");


             driver.get("https://www.manutd.com/en/matches/women/2019-20/friendly");



             /*---------------------------Women Team Table----------------------------------*/


             driver.get("https://www.manutd.com/en/matches/women/2019-20/all/league-table");


             driver.get("https://www.manutd.com/en/matches/women/2019-20/fa-womens-super-league/league-table");


             /*-------------------------------Under 23 Team----------------------*/
 
             driver.get("https://www.manutd.com/en/matches/under-23s/2019-20/all");


             driver.get("https://www.manutd.com/en/matches/under-23s/2019-20/premierleague2-division2");


             driver.get("https://www.manutd.com/en/matches/under-23s/2019-20/efltrophy");


             driver.get("https://www.manutd.com/en/matches/under-23s/2019-20/premierleague-internationalcup");



             /*---------------------------U23 Team Table----------------------------------*/


             driver.get("https://www.manutd.com/en/matches/under-23s/2018-19/all/league-table");


             driver.get("https://www.manutd.com/en/matches/under-23s/2018-19/premierleague2-division2/league-table");


             driver.get("https://www.manutd.com/en/matches/under-23s/2018-19/premierleague-internationalcup/league-table");


             /*--------------------------------Under 18--------------------------*/


             driver.get("https://www.manutd.com/en/matches/under-18s/2019-20/all");


             driver.get("https://www.manutd.com/en/matches/under-18s/2019-20/u18-premierleague-north");


             /*---------------------------U18 Team Table----------------------------------*/



             driver.get("https://www.manutd.com/en/matches/under-18s/2019-20/u18-premierleague-north/league-table");



         case 6:


             driver.get("https://www.manutd.com/en/players-and-staff");


             driver.get("https://www.manutd.com/en/players-and-staff/first-team");


             driver.get("https://www.manutd.com/en/players-and-staff/manager");


             driver.get("https://www.manutd.com/en/players-and-staff/women");


             driver.get("https://www.manutd.com/en/players-and-staff/reserves");


             driver.get("https://www.manutd.com/en/players-and-staff/the-academy");


             driver.get("https://www.manutd.com/en/players-and-staff/legends");


         case 7:


             driver.get("https://www.manutd.com/en/SignIn?ret=https://www.manutd.com/en/myunited");


         case 8:


              driver.get("https://www.manutd.com/en/visit-old-trafford");


         case 9:


             /*---------------------------MU Official App---------------------------*/


             driver.get("https://www.manutd.com/official-app?t=y&int_source=muwebsite&int_medium=menu&int_campaign=muwebsite&int_content=180910MUOfficialAppMenuCTA");


             driver.get("https://www.manutd.com/en/official-app");


             /*---------------------------MUTV---------------------------*/


             driver.get("https://www.manutd.com/en/mutv-international");


             driver.get("https://mutv.manutd.com/home?utm_campaign=mutv&utm_content=watchmutv&utm_medium=menu&utm_source=muwebsite");


             /*---------------------------MUTV---------------------------*/


             driver.get("https://www.mufoundation.org");


        default:


                driver.get("https://www.manutd.com/en");



        }​​​​


    }​​​​


    }​​​​

