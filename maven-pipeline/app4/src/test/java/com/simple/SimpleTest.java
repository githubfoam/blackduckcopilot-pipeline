package com.simple;

import junit.framework.TestCase;
import java.util.Properties;

public class SimpleTest extends TestCase
{
    public void testSomeMethod() throws Exception
    {
        Simple simple = new Simple();
        simple.someMethod();
        
        // Verify that we can load resource files from tess when using the clover plugin
        Properties props = new Properties();
        props.load(getClass().getResourceAsStream("/com/atlassian/maven/plugin/clover/samples/simple/test.properties"));
    }
}
