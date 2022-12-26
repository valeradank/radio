import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void radioLimitValues() {
        Radio radio = new Radio();
        radio.setStation(-1);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void radioLimitValues2() {
        Radio radio = new Radio();
        radio.setStation(0);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void radioLimitValues3() {
        Radio radio = new Radio();
        radio.setStation(1);
        int expected = 1;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void radioLimitValues4() {
        Radio radio = new Radio();
        radio.setStation(8);
        int expected = 8;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void radioLimitValues5() {
        Radio radio = new Radio();
        radio.setStation(9);
        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void radioLimitValues6() {
        Radio radio = new Radio();
        radio.setStation(10);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void radioEquivalentValues() {
        Radio radio = new Radio();
        radio.setStation(5);
        int expected = 5;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioEquivalentValues2() {
        Radio radio = new Radio();
        radio.setStation(25);
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioNextLimitValues() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioNextLimitValues2() {
        Radio radio = new Radio();
        radio.setStation(1);
        radio.nextStation();
        int expected = 2;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioNextLimitValues3() {
        Radio radio = new Radio();
        radio.setStation(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioNextLimitValues4() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeNextLimitValues() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.nextVolume();
        int expected = 1;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeNextLimitValues2() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.nextVolume();
        int expected = 2;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeNextLimitValues3() {
        Radio radio = new Radio();
        radio.setVolume(9);
        radio.nextVolume();
        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeNextLimitValues4() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.nextVolume();
        int expected = 10;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeSetLimitValues() {
        Radio radio = new Radio();
        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeSetLimitValues2() {
        Radio radio = new Radio();
        radio.setVolume(11);

        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeBack() {
        Radio radio = new Radio();
        radio.setVolume(1);
        radio.backVolume();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationBack() {
        Radio radio = new Radio();
        radio.setStation(1);
        radio.backStation();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeBack2() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.backVolume();
        int expected = 9;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationBack2() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.backStation();
        int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }
}


