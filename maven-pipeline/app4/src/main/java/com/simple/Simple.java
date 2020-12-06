package com.simple;

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