package com.bartek.example.instagramviewer;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Bartek on 2014-11-28.
 */
public class UserFragment extends Fragment {

    private TextView userName;

    private ImageView photoImage;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.user_fragment, container, false);
        userName = (TextView) rootView.findViewById(R.id.userName);
        photoImage = (ImageView) rootView.findViewById(R.id.photoImage);
        return rootView;
    }
}
