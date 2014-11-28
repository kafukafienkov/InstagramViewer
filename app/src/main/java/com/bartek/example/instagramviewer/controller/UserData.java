package com.bartek.example.instagramviewer.controller;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Bartek on 2014-11-28.
 */
public class UserData {

    @SerializedName("images")
    private LocalImages localImages;

    class LocalImages {

        @SerializedName("standard_resolution")
        private LocalImage standardResolution;

    }

    class LocalImage {
        private String url;

    }

    public String getPhotoStandardURL() {
        return localImages.standardResolution.url;
    }
}
