package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    private org.junit.jupiter.api.Assertions Assertions;

    @Test
    public void shouldSetNextNumber() {
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setNumber(9);
        radio.nextNumberRadio();
        int expected = 0;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumber2() {
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setNumber(8);
        radio.nextNumberRadio();
        int expected = 9;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumber3() {
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setNumber(0);
        radio.nextNumberRadio();
        int expected = 1;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumber() {
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setNumber(0);
        radio.prevNumberRadio();
        int expected = 9;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumber2() {
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setNumber(1);
        radio.prevNumberRadio();
        int expected = 0;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumber3() {
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setNumber(9);
        radio.prevNumberRadio();
        int expected = 8;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldСurrentVolumeMax() {
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldСurrentVolumeMax2() {
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldСurrentVolumeMin() {
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldСurrentVolumeMin2() {
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetNumberTestMin() {
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setNumber(-1);
        int expected = 0;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetNumberTestMax() {
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setNumber(10);
        int expected = 0;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetVolumeTestMax() {
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setVolume(101);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetVolumeTestMin() {
        ru.netology.javaqa.Radio radio = new ru.netology.javaqa.Radio();
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}
