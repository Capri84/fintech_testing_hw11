package espresso.base;

import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.rule.ActivityTestRule;

import com.fastaccess.ui.modules.main.MainActivity;

import org.junit.Rule;

import espresso.screens.DescriptionPage;
import espresso.screens.DrawerMenuPage;
import espresso.screens.MainFeedPage;
import espresso.screens.SettingsPage;
import espresso.screens.SubmitFeedbackPage;
import espresso.screens.ThemesPage;
import espresso.screens.TrendingPage;

public class BaseRunner {

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public IntentsTestRule<MainActivity> intentsRule = new IntentsTestRule<>(MainActivity.class);

    public ActivityTestRule<MainActivity> getActivityRule() {
        return activityRule;
    }

    public MainFeedPage mainFeedPage = new MainFeedPage();
    public DrawerMenuPage drawerMenuPage = new DrawerMenuPage();
    public TrendingPage trendingPage = new TrendingPage();
    public SettingsPage settingsPage = new SettingsPage();
    public ThemesPage themesPage = new ThemesPage();
    public SubmitFeedbackPage submitFeedbackPage = new SubmitFeedbackPage();
    public DescriptionPage descriptionPage = new DescriptionPage();
}
