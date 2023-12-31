package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenJacketsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenJacketsTest extends BaseTest {

    HomePage homepage = new HomePage();
    WomenJacketsPage womenPage = new WomenJacketsPage();


    @Test
    public void verifyTheSortByProductNameFilter() {
        homepage.mouseHoverOnWomenMenu();
        homepage.mouseHoverOnTops();
        homepage.clickOnJackets();
        womenPage.selectProductNameFilter(" Product Name ");
        Assert.assertEquals(womenPage.getProductList1(), womenPage.getProductList2());
    }

    @Test
    public void verifyTheSortByPriceFilter() {
        homepage.mouseHoverOnWomenMenu();
        homepage.mouseHoverOnTops();
        homepage.clickOnJackets();
        womenPage.selectProductNameFilter(" Price ");
        Assert.assertEquals(womenPage.getPriceList1(), womenPage.getPriceList2());
    }
}
