package com.example.ra.tutorialproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

   /* public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);

        startActivity(intent);
    }

       public void thirdOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
        startActivity(intent);
    } */

    @Override
    public void onClick(View view) {

        Intent intent;
        switch (view.getId())
        {
            case R.id.button1: {
                intent = new Intent(MainActivity.this,SecondActivity.class);
            } break;

            case R.id.button2: {
                intent = new Intent(MainActivity.this,ThirdActivity.class);
            } break;

            case R.id.button3: {
                intent = new Intent(MainActivity.this,FourthActivity.class);
            } break;

            case R.id.button4:{
                intent = new Intent(MainActivity.this,FifthActivity.class);
            } break;
            case R.id.button5 :
            {
                intent = new Intent(MainActivity.this, SixthActivity.class);
            }break;

            default: intent = new Intent(MainActivity.this,MainActivity.class);
        }

        startActivity(intent);
    }
}
