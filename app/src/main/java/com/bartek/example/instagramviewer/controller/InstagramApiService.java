package com.bartek.example.instagramviewer.controller;

import com.bartek.example.instagramviewer.UserMedia;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by Bartek on 2014-11-28.
 */
public interface InstagramApiService {

    @GET("/users/{userId}/media/recent/")
    void getUserPhotos(@Path("userId") long userId,
                       @Query("client_id") String clientId,
                       Callback<UserMedia> callback);
}
