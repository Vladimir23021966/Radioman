package ru.netology.homework.radiomanMvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // Тесты уровня громкости
    // установка громкости
    @Test
    public void shouldCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);
        int expected = 50;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    //установка громкости выше максимального значения
    @Test
    public void shouldCurrentVolumeMoreMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(110);
        int expected = 100;
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
        volume.setCurrentVolume(50);
        volume.setIncreaseVolume();
        int expected = 51;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // уменьшение громкости
    @Test
    public void shouldDecreaseVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(50);
        volume.setDecreaseVolume();
        int expected = 49;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // уменьшение громкости меньше максимальной границы
    @Test
    public void shouldVolumeLessMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.setDecreaseVolume();
        int expected = 99;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // увеличение громкости больше максимальной границы
    @Test
    public void shouldVolumeMoreMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.setIncreaseVolume();
        int expected = 100;
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

    //Конструктор по колличеству станций
    // Установка радиостанции
    @Test
    public void shouldCurrentRadioStationK() {
        Radio station = new Radio(20);
        station.setCurrentRadioStation(15);
        int expected = 15;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    //установка радиостанции больше максимального значения
    @Test
    public void shouldCurrentRadioStationMoreMaxK() {
        Radio station = new Radio(20);
        station.setCurrentRadioStation(20);
        int expected = 19;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    //установка радиостанции меньше минимального значения
    @Test
    public void shouldCurrentRadioStationLessMinK() {
        Radio station = new Radio(20);
        station.setCurrentRadioStation(-2);
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    //уменьшение радиостанции от максимальной
    @Test
    public void shouldRadioStationLessMaxK() {
        Radio station = new Radio(20);
        station.setCurrentRadioStation(19);
        station.setPrevCurrentRadioStation();
        int expected = 18;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    // увеличение радиостанции от максимальной
    @Test
    public void shouldRadioStationMoreMaxK() {
        Radio station = new Radio(20);
        station.setCurrentRadioStation(19);
        station.setNextCurrentRadioStation();
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    // уменьшение радиостанции от минимальной

    @Test
    public void shouldRadioStationLessMinK() {
        Radio station = new Radio(20);
        station.setPrevCurrentRadioStation();
        int expected = 19;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    // увеличение радиостанции от минимальной
    @Test
    public void shouldRadioStationMoreMinK() {
        Radio station = new Radio(20);
        station.setNextCurrentRadioStation();
        int expected = 1;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    // уменьшение радиостанции

    @Test
    public void shouldPrevRadioStationK() {
        Radio station = new Radio(20);
        station.setCurrentRadioStation(10);
        station.setPrevCurrentRadioStation();
        int actual = station.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    // увеличение радиостанции
    @Test
    public void shouldNextRadioStationK() {
        Radio station = new Radio(20);
        station.setCurrentRadioStation(8);
        station.setNextCurrentRadioStation();
        int actual = station.getCurrentRadioStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }
}