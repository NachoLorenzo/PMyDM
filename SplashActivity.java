package com.example.akuma.splashimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashactivity);
        //Con este código, el splashactivity se mostrará a pantalla completa
        requestWindowFeature(Window.FEATURE_NO_TITLE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Ahora programamos el timer
        private long SPLASH_DELAY = 3000;//Delay de 3 segundos
            @Override
            protected void onCreate(Bundle savedInstanceState){
                super.onCreate(savedInstanceState);
                setContentView(R.layout.splashactivity);//

            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    Intent mainIntent = new Intent(getApplicationContext(), SplashActivity.class);//Queremos que se ejecute el splashactivity
                    startActivity(mainIntent);
                    finish();
                }
            };
            Timer timer = new Timer();
            timer.schedule(task, SPLASH_DELAY);
        }
    }
}
