package ru.netology.service;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    private CashbackHackService service;

    @BeforeSuite
    public void setUp() {
        service = new CashbackHackService();
    }

    @AfterSuite
    public void tearDown() {
        service = null;
    }

    @Test
    public void shouldRemainIfUnderBound() {
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainIfEqualsBound() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainIfAboveBound() {
        int actual = service.remain(1100);
        int expected = 900;
        assertEquals(actual, expected);
    }
}