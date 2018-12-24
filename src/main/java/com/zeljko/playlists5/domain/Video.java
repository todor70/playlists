package com.zeljko.playlists5.domain;

public class Video {

    private String id;
    private Snippet snippet;

    public Video() {
    }

    public Video(String id, Snippet snippet) {
        this.id = id;
        this.snippet = snippet;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", snippet=" + snippet +
                '}';
    }
}
