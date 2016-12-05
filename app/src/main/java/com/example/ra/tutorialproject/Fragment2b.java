package com.example.ra.tutorialproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ra on 12/5/16.
 */

public class Fragment2b extends Fragment {

    private TextView mTextView;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);

        View rootView =
                inflater.inflate(R.layout.fragment_2_b, container, false);

        mTextView = (TextView) rootView.findViewById(R.id.textViewF2b);

        return rootView;
    }

    public void setEnteredText(String text)
    {

        String itext  = text.toUpperCase();
        mTextView.setText(itext);
    }
}
