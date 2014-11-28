package com.bartek.example.instagramviewer.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bartek.example.instagramviewer.R;
import com.bartek.example.instagramviewer.model.UserData;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

/**
 * Created by Bartek on 2014-11-28.
 */
public class UserFragment extends Fragment {

    private UserData userData;

    private ImageView profileImage;

    private ImageView photoImage;

    private TextView userNameTextView;

    private TextView fullNameTextView;

    private TextView userId;

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.user_fragment, container, false);
        photoImage = (ImageView) rootView.findViewById(R.id.photoImage);
        profileImage = (ImageView) rootView.findViewById(R.id.profileImage);
        fullNameTextView = (TextView) rootView.findViewById(R.id.textViewFullName);
        fullNameTextView.setText(userData.getFullName());
        userNameTextView = (TextView) rootView.findViewById(R.id.textViewUserName);
        userNameTextView.setText(userData.getUserName());
        userId = (TextView) rootView.findViewById(R.id.userId);
        userId.setText("ID: " + userData.getId());
        presentUserPhotos();
        return rootView;
    }

    private void presentUserPhotos() {
        Picasso.with(getActivity())
                .load(userData.getPhotoStandardURL())
                .into(photoImage);

        Picasso.with(getActivity())
                .load(userData.getProfilePictureURL())
                .into(profileImage);
    }
}
