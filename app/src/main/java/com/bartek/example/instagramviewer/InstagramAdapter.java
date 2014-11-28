package com.bartek.example.instagramviewer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Bartek on 2014-11-28.
 */
public class InstagramAdapter extends FragmentStatePagerAdapter{

    private UserMedia userMedia;

    public InstagramAdapter(FragmentManager fm, UserMedia userMedia) {

        super(fm);
        this.userMedia = userMedia;
    }


    @Override
    public Fragment getItem(int i) {
        UserFragment userFragment = new UserFragment();
        userFragment.setUserData(userMedia.getData().get(i));
        return userFragment;
    }

    @Override
    public int getCount() {
        return userMedia.getData().size();
    }
}
