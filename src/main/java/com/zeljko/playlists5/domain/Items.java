package com.zeljko.playlists5.domain;

import java.util.ArrayList;
import java.util.List;

public class Items {

    private List<Video> items;

    public Items() {
        items = new ArrayList<>();
    }

    public List<Video> getItems() {
        return items;
    }

    public void setItems(List<Video> items) {
        this.items = items;
    }
}