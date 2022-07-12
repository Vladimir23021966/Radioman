package ru.netology.homework.radiomanMvn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    // Тесты уровня громкости
    @Test
    public void shouldCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        int expected = 5;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxBorderLeftVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(9);
        int expected = 9;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxBorderRightVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(11);
        int expected = 10;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxBorderVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        int expected = 10;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMinBorderLeftVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinBorderRightVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        int expected = 1;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinBorderVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 5;
        volume.increaseVolume();
        int expected = 6;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldIncreaseVolumeMoreMaxBoard() {
        Radio volume = new Radio();
        volume.currentVolume = 11;
        volume.increaseVolume();
        int expected = 10;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.currentVolume = 5;
        volume.decreaseVolume();
        int expected = 4;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldDecreaseVolumeLessMinBoard() {
        Radio volume = new Radio();
        volume.currentVolume = -1;
        volume.decreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    // Тесты номера станции
    @Test
    public void shouldCurrentRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(5);
        int expected = 5;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxBorderLeftRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(8);
        int expected = 8;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxBorderRightRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(10);
        int expected = 9;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxBorderRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);
        int expected = 9;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinBorderLeftRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinBorderRightRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(1);
        int expected = 1;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinBorderRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        Radio station = new Radio();
        station.currentRadioStation = 5;
        station.nextRadioStation();
        int expected = 6;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextMaxBorderRadioStation() {
        Radio station = new Radio();
        station.currentRadioStation = 9;
        station.nextRadioStation();
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStation() {
        Radio station = new Radio();
        station.currentRadioStation = 6;
        station.prevRadioStation();
        int expected = 5;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevMinBorderRadioStation() {
        Radio station = new Radio();
        station.currentRadioStation = 0;
        station.prevRadioStation();
        int expected = 9;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
}
