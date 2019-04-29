package uiautomator.screens;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject2;

public class TrendingPage extends Page {

    public TrendingPage(UiDevice device) {
        super(device);
    }

    public UiObject2 getActivityTitle() {
        return getUiObject(By
                .pkg("com.fastaccess.github.debug")
                .clazz("android.widget.TextView")
                .text("Trending"));
    }
}
