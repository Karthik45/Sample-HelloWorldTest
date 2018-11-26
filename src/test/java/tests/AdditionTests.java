package tests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.ArithmeticCalculationPage;
import utils.Categories;
import utils.TestListener;

@Listeners({TestListener.class})
@Epic("Addition")
@Feature("Addition Test Cases")
public class AdditionTests extends BaseTest {

    private ArithmeticCalculationPage cal = new ArithmeticCalculationPage();

    @Test(description = "Sample Test to check addition of two numbers.", groups = {Categories.ADD})
    public void test1() {
        cal.addition(2, 3, driver);
        cal.checkResultForAddition(5, driver);
    }

    @Test(description = "Sample Test to check addition of two numbers.", groups = {Categories.ADD})
    public void test2() {
        cal.addition(3, 4, driver);
        cal.checkResultForAddition(7, driver);
    }

    @Test(description = "Sample Test to check addition of two numbers.", groups = {Categories.ADD})
    public void test3() {
        cal.addition(4, 4, driver);
        cal.checkResultForAddition(10, driver);
        cal.generalSkipForTesting();
    }
}