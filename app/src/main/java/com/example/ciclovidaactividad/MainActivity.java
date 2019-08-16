package com.example.ciclovidaactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "CICLO DE VIDA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        //se crea la actividad
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
        //se inicia la actividad
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
        //se reinicia la actividad
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
        //se visualiza la actividad
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
        //se pausa la actividad. Segundo plano
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        //se oculta la actividad
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        //se cierra la aplicacion
    }
}
