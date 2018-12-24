package com.zeljko.playlists5.domain;

import com.zeljko.playlists5.util.Util;

public class Snippet {

    private String publishedAt;
    private String channelId;
    private String title;
    private Thumbnails thumbnails;
    private String channelTitle;
    private int position;
    private ResourceId resourceId;

    public Snippet() {
    }

    public Snippet(String publishedAt, String channelId, String title, Thumbnails thumbnails, String channelTitle) {
        this.publishedAt = publishedAt;
        this.channelId = channelId;
        this.title = title;
        this.thumbnails = thumbnails;
        this.channelTitle = channelTitle;
    }

    public Snippet(String publishedAt, String channelId, String title, Thumbnails thumbnails, String channelTitle, int position, ResourceId resourceId) {
        this.publishedAt = publishedAt;
        this.channelId = channelId;
        this.title = title;
        this.thumbnails = thumbnails;
        this.channelTitle = channelTitle;
        this.position = position;
        this.resourceId = resourceId;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = Util.manipulateDateFormat(publishedAt);
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Thumbnails getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
    }

    public String getChannelTitle() {
        return channelTitle;
    }

    public void setChannelTitle(String channelTitle) {
        this.channelTitle = channelTitle;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public ResourceId getResourceId() {
        return resourceId;
    }

    public void setResourceId(ResourceId resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public String toString() {
        return "Snippet{" +
                "publishedAt='" + publishedAt + '\'' +
                ", channelId='" + channelId + '\'' +
                ", title='" + title + '\'' +
                ", thumbnails=" + thumbnails +
                ", channelTitle='" + channelTitle + '\'' +
                ", position=" + position +
                ", resourceId=" + resourceId +
                '}';
    }
}
