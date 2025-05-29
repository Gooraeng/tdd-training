package com.back;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    @DisplayName("1 + 2 == 3")
    void test1() {
        App app = new App();
        int rs = app.plus(1, 2);

        Assertions.assertEquals(3, rs);
    }

    @Test
    @DisplayName("10 + 20 == 30")
    void test2() {
        App app = new App();
        int rs = app.plus(10, 20);

        Assertions.assertEquals(30, rs);
    }
}
