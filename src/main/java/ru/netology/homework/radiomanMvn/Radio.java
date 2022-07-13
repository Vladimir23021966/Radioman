package ru.netology.homework.radiomanMvn;

public class Radio {
    private int currentVolume;
    private int currentRadioStation;

    // код - уровень звука.


    public void setIncreaseVolume(int newCurrentVolume) {

        if (newCurrentVolume < 10) {
            newCurrentVolume++;
        }
        if (newCurrentVolume >=10) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;
    }

    public int getIncreaseCurrentVolume() {
        return currentVolume;
    }

    public void setDecreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            newCurrentVolume --;
        }
        if (newCurrentVolume <= 0) {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }

    public int getDecreaseCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        if (newCurrentVolume > 10) {
            newCurrentVolume = 10;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // код - номер станции .
    public void setNextCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 9) {
            newCurrentRadioStation++;
        }
        if (newCurrentRadioStation == 9) {
            newCurrentRadioStation = 0;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getNextCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setPrevCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 0) {
            newCurrentRadioStation--;
        }
        if (newCurrentRadioStation == 0) {
            newCurrentRadioStation = 9;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getPrevCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {

        if (newCurrentRadioStation < 0) {
            newCurrentRadioStation = 0;
        }
        if (newCurrentRadioStation > 9) {
            newCurrentRadioStation = 9;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }


}


