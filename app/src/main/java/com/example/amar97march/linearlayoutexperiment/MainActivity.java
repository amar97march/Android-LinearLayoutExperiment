package com.example.amar97march.linearlayoutexperiment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_layout);
        Toast.makeText(this,"In Oncreate",Toast.LENGTH_SHORT).show();
        Log.i("Info","In Oncreate");
    }
    @Override
    public void onStart() {
        super.onStart();
        Toast.makeText(this,"In OnStart",Toast.LENGTH_SHORT).show();
        Log.i("Info","In onStart");
    }
    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(this,"In onResume",Toast.LENGTH_SHORT).show();
        Log.i("Info","In onResume");
    }
    @Override
    public void onPause() {
        super.onPause();
        Toast.makeText(this,"In OnPause",Toast.LENGTH_SHORT).show();
        Log.i("Info","In OnPause");
    }
    @Override
    public void onStop() {
        super.onStop();
        Toast.makeText(this,"In OnStop",Toast.LENGTH_SHORT).show();
        Log.i("Info","In OnStop");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"In OnDestroy",Toast.LENGTH_SHORT).show();
        Log.i("Info","In OnDestroy");
    }
}
