package com.example.testing

import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test

import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondaryActivityTest {


    //activityscenario globally declare
    @get:Rule
    val activityRule = ActivityScenarioRule(Main2Activity::class.java)

    @Test
    fun testActivity_inView() {

        onView(withId(R.id.root_layout2))
            .check(matches(isDisplayed()))

        // Notice this does not effect the next test
        activityRule.scenario.moveToState(Lifecycle.State.DESTROYED)
    }

    // Visibility
    @Test
    fun testVisibility_title_nextButton() {
        onView(withId(R.id.activity_secondary_title))
            .check(matches(isDisplayed()))

        onView(withId(R.id.back_button))
            .check(matches(isDisplayed()))
    }

    // Text
    @Test
    fun testTitleTextDisplayed() {
        onView(withId(R.id.activity_secondary_title))
            .check(matches(withText(R.string.text_secondaryactivity)))
    }
}