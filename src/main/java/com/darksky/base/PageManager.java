package com.darksky.base;
import com.darksky.pages.*;
public class PageManager {

    public static MainPage loginPage;

    public static void initializePageObjects() {
        loginPage = new MainPage();

    }
}