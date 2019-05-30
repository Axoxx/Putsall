package com.septian.tubes.futsalan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    TextView skora;
    TextView skorb;
    TextView goala;
    TextView goalb;
    TextView minusa;
    TextView minusb;
    TextView hasil_akhir;
    int skorA=0;
    int skorB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);


        skora=(TextView)findViewById(R.id.skor_a);
        skorb=(TextView)findViewById(R.id.skor_b);
        goala=(Button)findViewById(R.id.goal_a);
        goalb=(Button)findViewById(R.id.goal_b);
        minusa=(Button)findViewById(R.id.minus_a);
        minusb=(Button)findViewById(R.id.minus_b);
        hasil_akhir=(Button)findViewById(R.id.hasil);
    }

    public void tampilSkorA(){skora.setText(skorA+"");
    }
    public void plus_ft_a(View v){
        skorA=skorA+1;
        tampilSkorA();
    }
    public void plus_dua_a(View v){
        if (skorA>0)
        skorA=skorA-1;
        tampilSkorA();
    }

    public void tampilSkorB(){
        skorb.setText(skorB+"");
    }
    public void plus_ft_b(View v){
        skorB=skorB+1;
        tampilSkorB();
    }
    public void plus_dua_b(View v){
        if (skorB>0)
        skorB=skorB-1;
        tampilSkorB();
    }


    public void tampil_hasil(View v){
        Intent i=new Intent(Score.this,Hasil.class);
        i.putExtra("ScoreA",skorA);
        i.putExtra("ScoreB",skorB);
        startActivity(i);


    }
    public void ulangi(View v){
        skorA=0;
        skorB=0;
        tampilSkorA();
        tampilSkorB();
    }
}
