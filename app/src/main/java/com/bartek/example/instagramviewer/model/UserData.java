package com.bartek.example.instagramviewer.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Bartek on 2014-11-28.
 */
public class UserData {

    @SerializedName("images")
    private LocalImages localImages;

    @SerializedName("user")
    private UserName userName;

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
    class UserName {

        @SerializedName("username")
        private String nameOfUser;

        @SerializedName("full_name")
        private String fullName;

        @SerializedName("profile_picture")
        private String profilePicture;

        @SerializedName("id")
        private Long id;

    }
    public String getId() {
        return String.valueOf(userName.id);
    }
    public String getUserName() {
        return userName.nameOfUser;
    }
    public String getFullName() {
        return userName.fullName;
    }
    public String getProfilePictureURL() {
        return userName.profilePicture;
    }

}
