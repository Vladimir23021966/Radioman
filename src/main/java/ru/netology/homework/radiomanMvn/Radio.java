package ru.netology.homework.radiomanMvn;

public class Radio {
    protected int currentVolume;
    protected int currentRadioStation;
    protected int stationCount=10;

    public Radio() {

    }

    public Radio(int stationCount){
        this.stationCount=stationCount;
    }
    // код - уровень звука.


    public void setIncreaseVolume() {

        if (currentVolume < 100) {
            currentVolume++;
        }
        if (currentVolume >= 100) {
            currentVolume = 100;
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
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    // код - номер станции .


    public void setNextCurrentRadioStation() {
        if (currentRadioStation < stationCount-1) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }


    public void setPrevCurrentRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = stationCount-1;
        }

    }


    public void setCurrentRadioStation(int currentRadioStation) {

        if (currentRadioStation < 0) {
            currentRadioStation = 0;
        }
        if (currentRadioStation > stationCount-1) {
            currentRadioStation = stationCount-1;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }


}



