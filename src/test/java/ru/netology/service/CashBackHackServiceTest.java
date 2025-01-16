package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackServiceTest {

    @Test
    public void ShouldCalculateAmountUnderBoundaryTest() {
        CashBackHackService cashback = new CashBackHackService();

        int actual = cashback.remain(9_999);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldCalculateAmountAboveBoundaryTest() {
        CashBackHackService cashback = new CashBackHackService();

        int actual = cashback.remain(4_001);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldCalculateTest() {
        CashBackHackService cashback = new CashBackHackService();

        int actual = cashback.remain(1_000);
        int expected = 1_000;

        assertEquals(actual, expected);
    }
}