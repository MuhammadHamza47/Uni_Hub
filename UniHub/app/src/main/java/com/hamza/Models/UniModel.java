package com.hamza.Models;

public class UniModel {
    int images;
    String websiteUrl;

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public UniModel(int images, String websiteUrl) {
        this.images = images;
        this.websiteUrl = websiteUrl;
    }
}
