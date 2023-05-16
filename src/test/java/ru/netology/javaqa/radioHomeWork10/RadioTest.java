package ru.netology.javaqa.radioHomeWork10;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    private org.junit.jupiter.api.Assertions Assertions;

    @Test
    public void NumberStationTest() {
        Radio radio = new Radio(80);
        int expected = 80;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxNumberStationTest() {
        Radio radio = new Radio(80);
        int expected = 79;
        int actual = radio.getMaxNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinNumberStationTest() {
        Radio radio = new Radio(80);
        int expected = 0;
        int actual = radio.getMinNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void NumberStationTest2() {
        Radio radio = new Radio();
        int expected = 10;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxNumberStationTest2() {
        Radio radio = new Radio();
        int expected = 9;
        int actual = radio.getMaxNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinNumberStationTest2() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getMinNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextNumber() {
        Radio radio = new Radio();
        radio.setNumber(radio.getMaxNumber());
        radio.nextNumberRadio();
        int expected = radio.getMinNumber();
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetPrevNumberTest() {
        Radio radio = new Radio();
        radio.setNumber(radio.getMinNumber());
        radio.prevNumberRadio();
        int expected = radio.getMaxNumber();
        ;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextMinNumberTest() {
        Radio radio = new Radio();
        radio.setNumber(0);
        radio.nextNumberRadio();
        int expected = 1;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevNumber2() {
        Radio radio = new Radio();
        radio.setNumber(1);
        radio.prevNumberRadio();
        int expected = 0;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevMaxNumberTest() {
        Radio radio = new Radio();
        radio.setNumber(9);
        radio.prevNumberRadio();
        int expected = 8;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldСurrentVolumeMax() {
        Radio radio = new Radio();
        radio.setVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldСurrentVolumeMax2() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldСurrentVolumeMin() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldСurrentVolumeMin2() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetMinNumberBorderTest() {
        Radio radio = new Radio();
        radio.setNumber(-10);
        int expected = 10;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetNumberTestMax() {
        Radio radio = new Radio();
        radio.setNumber(50);
        int expected = 10;
        int actual = radio.getNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetVolumeTestMax() {
        Radio radio = new Radio();
        radio.setVolume(101);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetVolumeTestMin() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetVolumeTestMin2() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getMinVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetVolumeTestMax2() {
        Radio radio = new Radio();
        int expected = 100;
        int actual = radio.getMaxVolume();
        Assertions.assertEquals(expected, actual);
    }
}
