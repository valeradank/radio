public class Radio {
    private int station;
    private int volume;
    private int maxStation;
    private int maxVolume;

    public Radio() {
        maxStation = 9;
        maxVolume = 100;
    }


    public Radio(int station) {
        maxStation = station - 1;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station < 0) {
            return;
        }
        if (station > maxStation) {
            return;
        }
        this.station = station;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > maxVolume) {
            return;
        }
        this.volume = volume;
    }

    public void nextVolume() {
        if (volume < maxVolume) {
            volume = volume + 1;

        }
    }

    public void nextStation() {
        if (station != maxStation) {
            station = station + 1;
        } else {
            station = 0;

        }
    }

    public void backStation() {
        if (station != 0) {
            station--;

        } else {
            station = maxStation;
        }
    }

    public void backVolume() {
        if (volume != 0) {
            volume--;

        } else {
            volume = 0;
        }
    }
}
