package com.septian.tubes.futsalan;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Choose extends AppCompatActivity {

    public static final String LOG_TAG = Choose.class.getSimpleName();

    String id, username;
    SharedPreferences sharedpreferences;

    public static final String TAG_ID = "id";
    public static final String TAG_USERNAME = "username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        sharedpreferences = getSharedPreferences(Login.my_shared_preferences, Context.MODE_PRIVATE);

        id = getIntent().getStringExtra(TAG_ID);
        username = getIntent().getStringExtra(TAG_USERNAME);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.logout:
                logoutKan();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void logoutKan() {
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putBoolean(Login.session_status, false);
        editor.putString(TAG_ID, null);
        editor.putString(TAG_USERNAME, null);
        editor.commit();
        Intent intent = new Intent(Choose.this, Login.class);
        finish();
        startActivity(intent);
    }

    public void tampil_info(View v){
        Intent i=new Intent(Choose.this,MainActivity.class);
        startActivity(i);
    }

    public void tampil_score_board(View v){
        Intent i=new Intent(Choose.this,Score.class);
        startActivity(i);
    }
}
