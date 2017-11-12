package com.example.ady.cameraemicalculatorpersonlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        DataSerializable  Dataser = (DataSerializable) getIntent().getSerializableExtra("magic");

        Dataser.getclient().get(0).printclient();

        TextView tvclientDisplay = findViewById(R.id.clientDisplay);
        tvclientDisplay.setText(Dataser.getclient().get(0).printclient());




    }
}
