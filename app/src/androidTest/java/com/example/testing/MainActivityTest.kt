package com.example.testing

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {
//case 1
    /*//activityscenario locally declare
    //test root layout is visible or not
    @Test
    fun testActivity_inView() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    // Visibility
    @Test
    fun testVisibility_title_nextButton() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

//check button is visible or not
        onView(withId(R.id.activity_main_title))
            .check(matches(isDisplayed()))

//        check title is visible or not
        onView(withId(R.id.next_button))
            .check(matches(isDisplayed())) // method 1
        onView(withId(R.id.next_button))//method 2
            .check(matches(withEffectiveVisibility(Visibility.VISIBLE))) // method 2

    }

    // Text
    @Test
    fun testTitleTextDisplayed() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title))
            .check(matches(withText(R.string.text_mainactivity)))
    }
*/


    //    case2
    //main activity to main2activity
    /*@Test
    fun test_navSecondaryActivity() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.next_button)).perform(click())
        onView(withId(R.id.root_layout2)).check(matches(isDisplayed()))
    }
*/
    @Test
    fun test_backPress_toMainActivity() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.next_button)).perform(click())
        onView(withId(R.id.root_layout2)).check(matches(isDisplayed()))
//        onView(withId(R.id.back_button)).perform(click()) // method 1
//        onView(withId(R.id.root_layout1)).check(matches(isDisplayed()))
//            onView(withId(R.id.next_button)).perform(click())


        //opetating system back button
        pressBack() // method 2
        onView(withId(R.id.root_layout1)).check(matches(isDisplayed()))
    }

}


