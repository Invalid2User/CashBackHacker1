package ru.netology.service;
import static org.junit.Assert.assertEquals;

public class CashBackHackerTest {
    @org.junit.Test
    public void testRemain() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainCashback() {
        CashBackHacker service = new CashBackHacker();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainWhenOverBoundary() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainWhenTwiceOverBoundary() {
        CashBackHacker service = new CashBackHacker();
        int amount = 2000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainWhenOne() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void remainWhenAlmostBoundary() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1988;
        int actual = service.remain(amount);
        int expected = 12;
        assertEquals(expected, actual);
    }
}
