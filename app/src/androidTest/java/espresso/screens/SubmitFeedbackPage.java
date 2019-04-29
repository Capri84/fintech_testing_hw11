package espresso.screens;

import com.fastaccess.R;

import espresso.base.BaseRunner;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.AnyOf.anyOf;

public class SubmitFeedbackPage extends Page {

    private BaseRunner baseRunner = new BaseRunner();

    public void clickOk() {
        onView(withText("OK")).perform(click());
    }

    public void setTitle() {
        onView(withClassName(containsString("TextInputEditText")))
                .perform(typeText("hello"));
    }

    public void clickDescription() {
        onView(withId(R.id.description)).perform(click());
    }

    public void clickFAB() {
        onView(withId(R.id.submit)).perform(click());
    }

    public void checkToast() {
        onView(anyOf(withText("Message was sent"), withText("Сообщение отправлено")))
                .inRoot(withDecorView(not(baseRunner.getActivityRule()
                .getActivity().getWindow().getDecorView()))).check(matches(isDisplayed()));
    }
}
