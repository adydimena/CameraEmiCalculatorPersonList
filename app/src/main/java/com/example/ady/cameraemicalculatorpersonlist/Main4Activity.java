package com.example.ady.cameraemicalculatorpersonlist;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {

    private EditText etFirst;
    private EditText etLast;
    List<clients> listofclient = new ArrayList<>();
    private TextView tvtry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        etFirst = findViewById(R.id.fname);
        etLast = findViewById(R.id.lname);


    }

    public void addclient(View view) {
        String first = etFirst.getText().toString();
        String last = etLast.getText().toString();
        clients client = new clients(first,last);
        listofclient.add(client);
        etFirst.setText(" ");
        etLast.setText(" ");



    }

    public void showCLient(View view) {
        Intent intent = new Intent(this,Main5Activity.class);
        intent.putExtra("magic", (Parcelable) listofclient);
       startActivity(intent);




    }
}
