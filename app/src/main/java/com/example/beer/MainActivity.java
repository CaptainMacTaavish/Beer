package com.example.beer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String [] names = {"Light","Medium", "Strong"};
    String [] des = {"Beer is Light","Beer is Medium", "Beer is Strong"};

    ArrayAdapter<String> adapter;

    Spinner sp;
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = (Spinner)findViewById(R.id.sp);
        description = (TextView)findViewById(R.id.textview1);

        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1);

        sp.setAdapter(adapter);
        sp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        description.setText("" + des[position]);
                        break;

                    case 1:
                        description.setText("" + des[position]);
                        break;

                    case 2:
                        description.setText("" + des[position]);
                        break;
                }
            }
        });
    }
}