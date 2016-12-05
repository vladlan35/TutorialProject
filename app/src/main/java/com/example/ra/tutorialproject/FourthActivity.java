package com.example.ra.tutorialproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by ra on 12/5/16.
 */

public class FourthActivity extends AppCompatActivity implements Fragment2a.GetEnteredTextListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        android.support.v7.app.ActionBar MyActionBar = getSupportActionBar();
    }

    @Override
    public void getEnteredTest(String tempText) {
        FragmentManager fragmentManager = getSupportFragmentManager();

        Fragment2b fragment2b = (Fragment2b) fragmentManager.findFragmentById(R.id.fragment3);

        if(fragment2b!=null)
        {
            fragment2b.setEnteredText(tempText);
        }
    }
}
