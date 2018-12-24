package com.zeljko.playlists5.controller;

import com.zeljko.playlists5.domain.Items;
import com.zeljko.playlists5.domain.Video;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class PlaylistController {

    private String listID;
    private String title;

    @GetMapping("/playlists")
    public String playlists(Model model) {

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://www.googleapis.com/youtube/v3/playlists?key=AIzaSyAR06ziqnGCZG--Y2X4b6OPD0kLq6N_GdE&part=snippet&channelId=UClxh-FSQqL8U63N7Ue_LsOg";
        Items response = restTemplate.getForObject(url, Items.class);
        assert response != null;
        List<Video> items = response.getItems();
        model.addAttribute("items", items);
        return "playlists";
    }

    @GetMapping("/playlist/{id}")
    public String playlist(@PathVariable("id") String id, Model model) {

        RestTemplate restTemplate = new RestTemplate();
        listID = id;
        String url = "https://www.googleapis.com/youtube/v3/playlistItems?key=AIzaSyAR06ziqnGCZG--Y2X4b6OPD0kLq6N_GdE&part=snippet&maxResults=50&channelId=UClxh-FSQqL8U63N7Ue_LsOg&playlistId=" + listID;
        Items response = restTemplate.getForObject(url, Items.class);
        assert response != null;
        List<Video> items = response.getItems();


        switch (listID){
            case "PLe8D_ZQyQeDV-lEoCmTz6HO9GHe_T7kTN" : title = "Domaći Pop - stare stvari";
            break;
            case "PLe8D_ZQyQeDVoSSNX8jop9FCOuA-kGsHm" : title = "Domaći Rok - stare stvari";
                break;
            case "PLe8D_ZQyQeDV8GK6Ck3ZM4kFXDkR_j882" : title = "Strani Pop - stare stvari";
                break;
            case "PLe8D_ZQyQeDWhiwxi3p8CCy178sCpUsGT" : title = "Strani Rok - stare stvari";
                break;

        }

        model.addAttribute("items", items);
        model.addAttribute("title", title);
        return "playlist";
    }

    @GetMapping("/video/{id}")
    public String video(@PathVariable("id") String videoId, Model model) {
        String videoUrl = "https://www.youtube.com/embed/" + videoId + "?list=" + listID;
        model.addAttribute("videoUrl", videoUrl);
        return "video";
    }

}
