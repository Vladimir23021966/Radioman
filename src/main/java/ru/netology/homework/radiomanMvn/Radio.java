package ru.netology.homework.radiomanMvn;

public class Radio {
    protected int currentVolume;
    protected int currentRadioStation;

    // код - уровень звука.


    public void setIncreaseVolume() {

        if (currentVolume < 10) {
            currentVolume++;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
    }


    public void setDecreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
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


    public void setNextCurrentRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation++;
        }
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        }
    }


    public void setPrevCurrentRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        }
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
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



