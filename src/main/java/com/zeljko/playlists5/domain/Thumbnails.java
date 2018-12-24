package com.zeljko.playlists5.domain;

public class Thumbnails {

    private High high;

    public Thumbnails() {
    }

    public Thumbnails(High high) {
        this.high = high;
    }

    public High getHigh() {
        return high;
    }

    public void setHigh(High high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return "Thumbnails{" +
                "high=" + high +
                '}';
    }
}
