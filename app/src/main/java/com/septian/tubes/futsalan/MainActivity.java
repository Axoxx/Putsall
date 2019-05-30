package com.septian.tubes.futsalan;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void tampil_golden(View v){
        Intent i=new Intent(MainActivity.this,Golden.class);
        startActivity(i);
    }

    public void tampil_score_futsal(View v){
        Intent i=new Intent(MainActivity.this,ScoreFutsal.class);
        startActivity(i);
    }

    public void tampil_jakal7(View v){
        Intent i=new Intent(MainActivity.this,Jakal7.class);
        startActivity(i);
    }

    public void tampil_djuragan(View v){
        Intent i=new Intent(MainActivity.this,Djuragan.class);
        startActivity(i);
    }

    public void tampil_planet(View v){
        Intent i=new Intent(MainActivity.this,Planet.class);
        startActivity(i);
    }

    public void tampil_kedai(View v){
        Intent i=new Intent(MainActivity.this,Kedai.class);
        startActivity(i);
    }

    public void tampil_arena(View v){
        Intent i=new Intent(MainActivity.this,Arena.class);
        startActivity(i);
    }

    public void tampil_soccer(View v){
        Intent i=new Intent(MainActivity.this,Soccer.class);
        startActivity(i);
    }

    public void tampil_centro(View v){
        Intent i=new Intent(MainActivity.this,Centro.class);
        startActivity(i);
    }
}
