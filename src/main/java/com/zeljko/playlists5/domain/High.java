package com.zeljko.playlists5.domain;

public class High {

    private String url;

    public High() {
    }

    public High(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "High{" +
                "url='" + url + '\'' +
                '}';
    }
}
