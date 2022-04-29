package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class CashbackHackServiceTest {
    private CashbackHackService service;

    @BeforeEach
    public void setUp() {
        service = new CashbackHackService();
    }

    @AfterEach
    public void tearDown() {
        service = null;
    }

    @Test
    public void shouldRemainIfUnderBound() {
        int expected = 100;
        int actual = service.remain(900);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIfEqualsBound() {
        int expected = 0;
        int actual = service.remain(1000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainIfAboveBound() {
        int expected = 900;
        int actual = service.remain(1100);
        Assertions.assertEquals(expected, actual);
    }

}