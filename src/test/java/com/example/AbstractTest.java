package com.example;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public abstract class AbstractTest {
    @Nested
    class NestedTest {

        @Test
        void myTest() {
            assert 1 == 2;
        }
    }
}
