package com.example.ra.tutorialproject;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by ra on 12/5/16.
 */

public class Fragment1 extends android.support.v4.app.Fragment implements View.OnClickListener{

    private int mCounter = 0;
    private TextView mTextViewF;
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);

        View rootView =
                inflater.inflate(R.layout.fragment_1, container, false);

        Button Counter = (Button) rootView.findViewById(R.id.buttonF);
        mTextViewF = (TextView) rootView.findViewById((R.id.textViewF));
        Counter.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.buttonF)
        {

            mTextViewF.setText(" " + ++mCounter);
        }
        else mTextViewF.setText("FAIL");
    }
}
