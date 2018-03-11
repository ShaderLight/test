package com.eiipii;

import org.testng.annotations.Test;
import org.assertj.core.api.Assertions;

public class SimpleTest {
    @Test
    public void testAddition() {
        int i = 1 + 1;
        Assertions.assertThat(i).isEqualTo(2);
    }
}
