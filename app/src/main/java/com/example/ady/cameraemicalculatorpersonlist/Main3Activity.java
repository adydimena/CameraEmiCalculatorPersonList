package com.example.ady.cameraemicalculatorpersonlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import static java.lang.Math.pow;

public class Main3Activity extends AppCompatActivity {

    private SeekBar seek3;
    private SeekBar seek2;
    private SeekBar seek1;
    private TextView tvdisplay;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    double principal,NumofMon,interestRate, EMI;
    final double[] SeekcurrentValue = new double[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        seek1 = findViewById(R.id.Seek1);
        seek2 = findViewById(R.id.Seek2);
        seek3 = findViewById(R.id.Seek3);
        tvdisplay = findViewById(R.id.tvdisplay);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        seek1.setMax(35);
        seek2.setMax(15);
        seek3.setMax(500000);


        seek1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

            SeekcurrentValue[0] = i;
            tv1.setText("Current YEARS Progess:" + SeekcurrentValue[0]);
            NumofMon = SeekcurrentValue[0] * 12;
            EMI = (principal * interestRate* pow(1+interestRate,NumofMon)) / (pow(1+interestRate,NumofMon - 1));
            tvdisplay.setText("Your Montly payment is: \n" + EMI);



            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        });
        seek2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                SeekcurrentValue[1] = i;

                tv2.setText("Current INTEREST Progess:" + SeekcurrentValue[1]);
                interestRate =  (SeekcurrentValue[1] / 1200);
                EMI = (principal * interestRate* pow(1+interestRate,NumofMon)) / (pow(1+interestRate,NumofMon - 1));
                tvdisplay.setText("Your Montly payment is: \n" + EMI);





            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        });

        seek3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                SeekcurrentValue[2] = i;
                tv3.setText("Current PRINCIPAL Progess:" + SeekcurrentValue[2]);
                principal = SeekcurrentValue[2];
                EMI = (principal * interestRate* pow(1+interestRate,NumofMon)) / (pow(1+interestRate,NumofMon - 1));
                tvdisplay.setText("Your Montly payment is: \n" + EMI);




            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        });





    }

}
