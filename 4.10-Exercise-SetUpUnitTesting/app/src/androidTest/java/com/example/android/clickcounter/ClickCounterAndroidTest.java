package com.example.android.clickcounter;


import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class ClickCounterAndroidTest extends AndroidTestCase{

    @Rule
    public ActivityTestRule<ClickActivity> mActivityRule = new ActivityTestRule(ClickActivity.class);

    @Test
    public void verifyIfInicialCounterIs0(){
        onView(withId(R.id.click_count_text_view))
                .check(matches(withText("0")));

    }

    @Test
    public void verifyClickedOnce(){
        clickTimes(1);
        onView(withId(R.id.click_count_text_view))
                .check(matches(withText("1")));
    }

    @Test
    public void verifyClickedTwice(){
        clickTimes(2);
        onView(withId(R.id.click_count_text_view))
                .check(matches(withText("2")));
    }

    @Test
    public void verifyClicked10Times(){
        clickTimes(10);
        onView(withId(R.id.click_count_text_view))
                .check(matches(withText("10")));
    }

    public void clickTimes(int times) {
        ViewInteraction viewInteraction = onView(withId(R.id.click_button));
        for(int i = 0; i < times; i++){
            viewInteraction.perform(ViewActions.click());
        }
    }


}
