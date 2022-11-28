public class WaterBottle {
    private int volume;

    public WaterBottle(int volume) {
        this.volume = 100;
    }

    public int volumeStartsAt100() {
        return this.volume;
    }

    public int drinkRemoves10FromVolume() {
        return this.volume - 10;
    }

    public int emptyBottle() {
        return this.volume = 0;
    }

    public int fillBottle() {
        return this.volume;
    }
}
