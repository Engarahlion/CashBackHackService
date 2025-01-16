package ru.netology.service;

import static org.junit.Assert.*;
public class CashBackHackServiceTest {

    @org.junit.Test
    public void ShouldCalculateAmountUnderBoundaryTest() {
        CashBackHackService cashback = new CashBackHackService();
        int actual = cashback.remain(9_999);
        int expected = 1;
        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void ShouldCalculateAmountAboveBoundaryTest() {
        CashBackHackService cashback = new CashBackHackService();
        int actual = cashback.remain(4_001);
        int expected = 999;
        assertEquals(actual, expected);
    }
    @org.junit.Test
    public void ShouldCalculateTest() {
        CashBackHackService cashback = new CashBackHackService();
        int actual = cashback.remain(1_000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}