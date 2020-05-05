package com.example.testing

import org.junit.runner.RunWith
import org.junit.runners.Suite

//video 5
//chaining test.
@RunWith(Suite::class)
@Suite.SuiteClasses(
    MainActivityTest::class,
    SecondaryActivityTest::class
)
class ActivityTestSuite