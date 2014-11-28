package com.bartek.example.instagramviewer;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.bartek.example.instagramviewer.controller.InstagramApiService;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends FragmentActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        loadPhotos();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    private void loadPhotos() {

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://api.instagram.com/v1/")
                .build();

        InstagramApiService service = restAdapter.create(InstagramApiService.class);
        service.getUserPhotos(1755886, "ca0dff7571cd4fa3b70a025105cc2b60", new Callback<UserMedia>() {
            @Override
            public void success(UserMedia userMedia, Response response) {
                presentUserData(userMedia);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }

    private void presentUserData(UserMedia userMedia) {
        InstagramAdapter adapter = new InstagramAdapter(getSupportFragmentManager(), userMedia);
        viewPager.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
