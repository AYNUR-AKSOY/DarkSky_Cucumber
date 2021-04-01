package com.darksky.pages;

import com.darksky.utils.ElementUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.darksky.base.BasePage.driver;

public class MainPage {

    // locators using FindBy

    @FindBy(xpath = "//input[@type='text']")
    private static WebElement myText;

    @FindBy(xpath = "//img[@alt='Search Button']")
    private static WebElement searchBtn;

    @FindBy(xpath = "//input[@type='text']")
    private static WebElement locationText;

    @FindBy(xpath = "//span[@class='low-temp-text']")
    private static WebElement lowTemp1;

    @FindBy(xpath = "//span[@class='high-temp-text']")
    private static WebElement maxTemp1;

    @FindBy(xpath = "//a[@data-day='0']//span[@class='minTemp']")
    private static WebElement lowTemp2;

    @FindBy(xpath = "//a[@data-day='0']//span[@class='maxTemp']")
    private static WebElement maxTemp2;

    // Constructor
    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public static void enterLocationText(String location) {
        myText.clear();
        ElementUtil.doSendText(locationText, location);
    }
    public static void clickSearchBtn() throws InterruptedException {
        ElementUtil.doClick(searchBtn);
        Thread.sleep(3000);
    }
    public static String verifyTitle(){
        return ElementUtil.doGetPageTitle();
    }
    public static String lowTemp1String(){
        return lowTemp1.getText();
    }
    public static String lowTemp2String(){
        return lowTemp2.getText();
    }
    public static String maxTemp1String(){
        return maxTemp1.getText();
    }
    public static String maxTemp2String(){
        return maxTemp2.getText();
    }

}
