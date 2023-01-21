package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashBackHackerTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainCashback() {
        CashBackHacker service = new CashBackHacker();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void remainWhenOverBoundary() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void remainWhenTwiceOverBoundary() {
        CashBackHacker service = new CashBackHacker();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void remainWhenOne() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void remainWhenAlmostBoudary() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1988;
        int actual = service.remain(amount);
        int expected = 12;
        assertEquals(actual, expected);
    }
}