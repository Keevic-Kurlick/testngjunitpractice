package ru.netology.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    private CashbackHackService service;

    @Before
    public void setUp() {
        service = new CashbackHackService();
    }

    @After
    public void tearDown() {
        service = null;
    }

    @Test
    public void shouldRemainIfUnderBound() {
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIfEqualsBound() {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIfAboveBound() {
        int expected = 900;
        int actual = service.remain(1100);
        assertEquals(expected, actual);
    }

}