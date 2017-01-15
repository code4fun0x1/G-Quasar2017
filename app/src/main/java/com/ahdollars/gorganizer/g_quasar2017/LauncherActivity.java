package com.ahdollars.gorganizer.g_quasar2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(LauncherActivity.this,ViewPagerMainActivity.class));
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
