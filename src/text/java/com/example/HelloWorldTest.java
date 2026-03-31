package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {

    @Test
    void testSayHello() {
        HelloWorld hw = new HelloWorld();
        String result = hw.sayHello();
        assertEquals("Hello World from Maven!", result);
    }
}