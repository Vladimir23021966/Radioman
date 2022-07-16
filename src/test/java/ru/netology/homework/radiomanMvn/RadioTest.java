package ru.netology.homework.radiomanMvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    // Тесты уровня громкости
    // установка громкости
    @Test
    public void shouldCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        int expected = 5;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //установка громкости выше максимального значения
    @Test
    public void shouldCurrentVolumeMoreMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(11);
        int expected = 10;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    //Установка громкости меньше минимального значения
    @Test
    public void shouldCurrentVolumeLessMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // увеличение громкости
    @Test
    public void shouldIncreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        volume.setIncreaseVolume();
        int expected = 6;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // уменьшение громкости
    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        volume.setDecreaseVolume();
        int expected = 4;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // уменьшение громкости меньше максимальной границы
    @Test
    public void shouldVolumeLessMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        volume.setDecreaseVolume();
        int expected = 9;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // увеличение громкости больше максимальной границы
    @Test
    public void shouldVolumeMoreMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        volume.setIncreaseVolume();
        int expected = 10;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //уменьшение громкости    ниже минимальной границы
    @Test
    public void shouldVolumeLessMin() {
        Radio volume = new Radio();
        volume.setDecreaseVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // увеличение громкости выше минимальной границы
    @Test
    public void shouldVolumeMoreMin() {
        Radio volume = new Radio();
        volume.setIncreaseVolume();
        int expected = 1;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    // Тесты номера станции

    // Установка радиостанции
    @Test
    public void shouldCurrentRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(5);
        int expected = 5;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    //установка радиостанции больше максимального значения
    @Test
    public void shouldCurrentRadioStationMoreMax() {
        Radio station = new Radio();
        station.setCurrentRadioStation(20);
        int expected = 9;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    //установка радиостанции меньше минимального значения
    @Test
    public void shouldCurrentRadioStationLessMin() {
        Radio station = new Radio();
        station.setCurrentRadioStation(-2);
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    //уменьшение радиостанции от максимальной
    @Test
    public void shouldRadioStationLessMax() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);
        station.setPrevCurrentRadioStation();
        int expected = 8;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    // увеличение радиостанции от максимальной
    @Test
    public void shouldRadioStationMoreMax() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);
        station.setNextCurrentRadioStation();
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    // уменьшение радиостанции от минимальной

    @Test
    public void shouldRadioStationLessMin() {
        Radio station = new Radio();
        station.setPrevCurrentRadioStation();
        int expected = 9;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    // увеличение радиостанции от минимальной
    @Test
    public void shouldRadioStationMoreMin() {
        Radio station = new Radio();
        station.setNextCurrentRadioStation();
        int expected = 1;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    // уменьшение радиостанции

    @Test
    public void shouldPrevRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(1);
        station.setPrevCurrentRadioStation();
        int actual = station.getCurrentRadioStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    // увеличение радиостанции
    @Test
    public void shouldNextRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(8);
        station.setNextCurrentRadioStation();
        int actual = station.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }
}