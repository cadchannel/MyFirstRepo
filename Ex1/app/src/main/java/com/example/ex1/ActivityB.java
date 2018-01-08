package com.example.ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class ActivityB extends AppCompatActivity {

    private static final String TAG = ActivityB.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate(Bundle) called"); //log activity
        setContentView(R.layout.activity_b);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called"); //log activity
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called"); //log activity
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called"); //log activity
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called"); //log activity
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called"); //log activity
    }
}
