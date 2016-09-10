/*
 * (C) Copyright 2016 Diraj H S.
 */
package com.diraj.androidnanodegree;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private final String TAG = HomeActivity.class.getSimpleName();

    private void showToast(String text) {
        String toastString = "This button will launch my ";
        Toast appToast = Toast.makeText(getApplicationContext(), toastString + text, Toast.LENGTH_SHORT);
        appToast.show();
    }

    public void onButtonClick(View view) {
        switch (view.getId()) {
            case R.id.popularMovies:
                showToast(getString(R.string.popular_movies) + " app!");
                break;
            case R.id.stockHawk:
                showToast(getString(R.string.stock_hawk) + " app!");
                break;
            case R.id.buildItBigger:
                showToast(getString(R.string.build_it_bigger) + " app!");
                break;
            case R.id.makeYourAppMaterial:
                showToast(getString(R.string.make_your_app_material) + " app!");
                break;
            case R.id.goUbiquitous:
                showToast(getString(R.string.go_ubiquitous) + " app!");
                break;
            case R.id.capstone:
                showToast(getString(R.string.capstone) + " app!");
                break;
            default:
                Log.e(TAG, "Shouldn't have come to this...");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}
