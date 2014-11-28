package com.bartek.example.instagramviewer;

import com.bartek.example.instagramviewer.controller.UserData;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Bartek on 2014-11-28.
 */
public class UserMedia {
    @SerializedName("data")
    private List<UserData> data;

    public List<UserData> getData() {
        return data;
    }
}
