package com.suite;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com")
//@ExcludePackages("com.suite")
@IncludePackages("com.junit5")
public class TestSuite {
}
