package espresso.tests;

import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import espresso.base.BaseRunner;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class FastHubTestsEspresso extends BaseRunner {

    @Test
    public void trendingTest() {
        mainFeedPage.openDrawer();
        drawerMenuPage.clickTrending();
        trendingPage.checkTrending();
    }

    @Test
    public void themeTest() {
        mainFeedPage.openDrawer();
        drawerMenuPage.clickSettings();
        settingsPage.clickTheme();
        themesPage.swipeTheme();
        themesPage.clickFAB();
        themesPage.checkThemeChangedToGray();
    }

    @Test
    public void restorePurchasesTest() {
        mainFeedPage.openDrawer();
        drawerMenuPage.swipeUpDrawer();
        drawerMenuPage.intentsInit();
        drawerMenuPage.clickRestorePurchases();
        mainFeedPage.checkIntent();
        mainFeedPage.intentsRelease();
    }

    @Test
    public void toastTest() {
        mainFeedPage.openDrawer();
        drawerMenuPage.swipeUpDrawer();
        drawerMenuPage.clickSendFeedback();
        submitFeedbackPage.clickOk();
        submitFeedbackPage.setTitle();
        submitFeedbackPage.clickDescription();
        descriptionPage.checkDeviceInfo();
        descriptionPage.clickSumbitBtn();
        submitFeedbackPage.clickFAB();
        submitFeedbackPage.checkToast();
    }

    @Test
    public void aboutTest() {
        mainFeedPage.openDrawer();
        drawerMenuPage.swipeUpDrawer();
        drawerMenuPage.clickAbout();
        //scroll
        //Changelog + Drawable
        //onView(allOf(withId(R.id.mal_list_card_title), withText("About"))).perform(scrollTo());
        //onData(withId(R.id.mal_card_recyclerview));
    }
}
