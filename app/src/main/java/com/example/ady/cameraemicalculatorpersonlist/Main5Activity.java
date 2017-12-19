package com.example.ady.cameraemicalculatorpersonlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main5Activity extends AppCompatActivity {

    private TextView tvclientDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        tvclientDisplay = findViewById(R.id.clientDisplay);
        List<clients> clientsList = getIntent().getExtras().getParcelable("magic");
        tvclientDisplay.append(clientsList.get(0).printclient());




    }
}
