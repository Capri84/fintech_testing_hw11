package espresso.screens;

import com.fastaccess.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class SettingsPage extends Page {

    public void clickTheme() {
        onView(allOf(withId(R.id.iconItemTitle), withText("Theme"))).perform(click());
    }
}
