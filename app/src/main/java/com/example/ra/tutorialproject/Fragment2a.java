package com.example.ra.tutorialproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ra on 12/5/16.
 */

public class Fragment2a extends Fragment implements View.OnClickListener {

    private EditText mEditText;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);

        View rootView =
                inflater.inflate(R.layout.fragment_2_a, container, false);

        Button button1 = (Button) rootView.findViewById(R.id.buttonF2a);
         mEditText = (EditText) rootView.findViewById(R.id.editTextF2a);

        button1.setOnClickListener(this);
        return rootView;
    }

    @Override
    public void onClick(View view) {

        String tempText ;

                 tempText = mEditText.getText().toString();



        GetEnteredTextListener listener = (GetEnteredTextListener) getActivity();

        listener.getEnteredTest(tempText);
    }

    public interface GetEnteredTextListener {
        void getEnteredTest(String tempText);
    }
}
