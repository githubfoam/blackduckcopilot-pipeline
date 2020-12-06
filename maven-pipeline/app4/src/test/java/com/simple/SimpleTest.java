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
}package com.simple;

public class Simple
{
    public void someMethod()
    {
        assert true == true : "true was not true";

        // Reference a class that we exclude in the instrumentation
        new Dummy();

        int i = 0;
        if (i > 0)
        {
            i = i + 1;
        }
    }
}