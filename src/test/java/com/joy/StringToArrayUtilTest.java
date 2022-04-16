package com.joy;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringToArrayUtilTest {

    @Test
    void parseArray() {
        assertThat(StringToArrayUtil.parseArray("1 2 1 3 1 1 2")).containsExactly(1, 2, 1, 3, 1, 1, 2);
        assertThat(StringToArrayUtil.parseArray("1 2 1 3 1 1 2 ")).containsExactly(1, 2, 1, 3, 1, 1, 2);
        assertThat(StringToArrayUtil.parseArray(" 1 2 1 3 1 1 2 ")).containsExactly(1, 2, 1, 3, 1, 1, 2);
        assertThat(StringToArrayUtil.parseArray("11 12 123")).containsExactly(11, 12, 123);
        assertThat(StringToArrayUtil.parseArray("11 12 abc123")).isNull();
    }


}
