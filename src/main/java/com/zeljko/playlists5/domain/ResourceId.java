package com.zeljko.playlists5.domain;

public class ResourceId {

    private String videoId;

    public ResourceId() {
    }

    public ResourceId(String videoId) {
        this.videoId = videoId;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    @Override
    public String toString() {
        return "ResourceId{" +
                "videoId='" + videoId + '\'' +
                '}';
    }
}
