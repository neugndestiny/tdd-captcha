package com.demo.capcha;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaptchaTest {

    @Test
    public void firstPatternLeftOperandShouldBe1() {
        Captcha captcha = new Captcha(1, 1, 1, 1);
        Assert.assertEquals("1 + One", captcha.toString());
    }

    @Test
    public void firstPatternLeftOperandShouldBe2() {
        Captcha captcha = new Captcha(1, 2, 1, 1);
        Assert.assertEquals("2 + One", captcha.toString());
    }
}