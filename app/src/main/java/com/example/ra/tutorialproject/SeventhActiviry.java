package com.example.ra.tutorialproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ra on 12/12/16.
 */

public class SeventhActiviry extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activiry_seventh);

        android.support.v7.app.ActionBar MyActionBar = getSupportActionBar();

        TextView textView = (TextView) findViewById(R.id.textView71);
        ImageView imageView = (ImageView) findViewById(R.id.imageView72);

        int impDataId = getIntent().getExtras().getInt("item_id");


        String impDataText = getIntent().getExtras().getString("item_text");

        textView.setText(impDataText);
        imageView.setImageResource(impDataId);


    }
}
