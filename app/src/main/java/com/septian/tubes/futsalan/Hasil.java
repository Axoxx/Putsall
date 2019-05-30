package com.septian.tubes.futsalan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {

    TextView skora2;
    TextView skorb2;
    TextView tim_menang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        skora2 = (TextView) findViewById(R.id.skor_a2);
        skorb2 = (TextView) findViewById(R.id.skor_b2);
        tim_menang = (TextView) findViewById(R.id.pemenang);

        Intent i = getIntent();
        int hasilskora = i.getIntExtra("ScoreA", 0);
        int hasilskorb = i.getIntExtra("ScoreB", 0);
        skora2.setText(hasilskora + "");
        skorb2.setText(hasilskorb + "");

        if (hasilskora > hasilskorb) {
            tim_menang.setText("TIM A");
        } else if (hasilskora < hasilskorb) {
            tim_menang.setText("TIM B");
        } else if (hasilskora == hasilskorb) {
            tim_menang.setText("DRAW");
        }
    }
}
