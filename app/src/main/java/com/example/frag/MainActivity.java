package com.example.frag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class MainActivity extends AppCompatActivity implements ListFrag.ItemSelected{

    TextView tvDescription;
    String [] description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDescription =findViewById(R.id.tvDescription);

        description=getResources().getStringArray(R.array.descriptions);


    }

    @Override
    public void onItemSelected(int index) {

        tvDescription.setText(description[index]);
    }
}
