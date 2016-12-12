package com.example.ra.tutorialproject;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SixthActivity extends AppCompatActivity {

    private static  List<setObjIT> MyObjects;
    private ListView mTextImage;
    private ArrayAdapter<setObjIT> adapter ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        android.support.v7.app.ActionBar MyActionBar = getSupportActionBar();

        MyObjects =   new ArrayList<setObjIT>();
        mTextImage = (ListView) findViewById(R.id.listView2);

        adapter =  new MyAdapter(this);
        mTextImage.setAdapter(adapter);

        mTextImage.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SixthActivity.this, SeventhActiviry.class);


                MyObjects.get(i).text = "GOOOO";
                setObjIT tempItem = MyObjects.get(i);

                int expDataID = tempItem.imID;
                String expDataText = tempItem.text;

                intent.putExtra("item_id",expDataID);
                intent.putExtra("item_text", expDataText);

                startActivity(intent);


            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sixth, menu);
        return true;
    }

    public void addOnClick(MenuItem item) {
        setObjIT temp = new setObjIT("HI MAN");

        adapter.add(temp);
    }







    private static class setObjIT{
        public  String text;
        public final int  imID = R.drawable.myimage;

        public setObjIT(String text)
        {
            this.text = text;

        }

    }


    private class MyAdapter extends ArrayAdapter<setObjIT>
    {
        public MyAdapter(Context context)
        {
            super(context, R.layout.my_layout_test, MyObjects);
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
          //  return super.getView(position, convertView, parent);

            setObjIT imageText = getItem(position);

            if(convertView == null)
            {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_layout_test,null);

            }

            ((TextView)convertView.findViewById(R.id.textView123654)).setText(imageText.text);
            ((ImageView)convertView.findViewById(R.id.imageView)).setImageResource(imageText.imID);

            return convertView;
        }
    }


}
