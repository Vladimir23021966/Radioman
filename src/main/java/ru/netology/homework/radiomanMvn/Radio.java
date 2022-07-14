package ru.netology.homework.radiomanMvn;

public class Radio {
    protected int currentVolume;
    protected int currentRadioStation;

    // код - уровень звука.


    public int setIncreaseVolume() {

        if (currentVolume < 10) {
            currentVolume++;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
        return this.currentVolume;
    }


    public int setDecreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        return this.currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {

        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    // код - номер станции .


    public int setNextCurrentRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
        }
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
        return this.currentRadioStation;
    }


    public int setPrevCurrentRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
        return this.currentRadioStation;
    }


    public void setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation < 0) {
            currentRadioStation = 0;
        }
        if (currentRadioStation > 9) {
            currentRadioStation = 9;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }


}



