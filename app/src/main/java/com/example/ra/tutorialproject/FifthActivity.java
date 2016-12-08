package com.example.ra.tutorialproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by ra on 12/8/16.
 */

public class FifthActivity extends AppCompatActivity {

    private ListView mDayOfWeek ;

    private String[] mdaynames;

    public FifthActivity() {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fifth);

        android.support.v7.app.ActionBar MyActionBar = getSupportActionBar();

        mdaynames  = getResources().getStringArray(
                R.array.days);


        mDayOfWeek =  (ListView) findViewById(R.id.listView);
        ListAdapter listAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, mdaynames);

            mDayOfWeek.setAdapter(listAdapter);
    }
}
