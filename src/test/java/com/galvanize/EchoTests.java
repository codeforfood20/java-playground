package com.galvanize;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EchoTests {

    @Test
    public void testShoutReturnUpperCase() {
        // setup
        Echo echo = new Echo();

        // execution
        String result = echo.shout("hello");

        // assertions
        assertEquals("HELLO!", result);
    }
}
