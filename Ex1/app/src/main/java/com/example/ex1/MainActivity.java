package com.example.ex1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // repo test Carmen
    // develop branch
    // for task 1

    private static final String TAG = MainActivity.class.getSimpleName();

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            launchActivityB();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate(Bundle) called"); //log activity
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(listener);
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

    public void launchActivityB() {
        Intent intent = new Intent(this,ActivityB.class);
        Log.d(TAG, "launchActivityB() called"); //log activity
        startActivity(intent);

    }
}
