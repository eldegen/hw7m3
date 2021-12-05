package com.example.hw7m3.SecondFragment;

public class SecondItemModel {
    private String title, time;
    private int profile, post;

    public SecondItemModel(String title, String time, int profile, int post) {
        this.title = title;
        this.time = time;
        this.profile = profile;
        this.post = post;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public int getPost() {
        return post;
    }

    public void setPost(int post) {
        this.post = post;
    }
}
