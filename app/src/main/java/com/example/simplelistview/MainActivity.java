package com.example.simplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {



    ListView list;

    String[] city = {"Bhavnagar", "Surat", "Bharuch", "Ahemdabad", "Rajkot", "Amreli", "Kutch"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list = findViewById(R.id.list);


        // ADAPTER : Used to View Data in any kind of View.

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, city);

        // Setting adapter on list View

        list.setAdapter(adapter);

    }
}