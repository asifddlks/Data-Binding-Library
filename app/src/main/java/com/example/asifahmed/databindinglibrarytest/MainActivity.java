package com.example.asifahmed.databindinglibrarytest;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableInt;

import com.example.asifahmed.databindinglibrarytest.databinding.ActivityMainBinding;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        final DataClass dataClass = new DataClass();
        dataClass.setName("helloData");
        dataClass.setObservableInt(new ObservableInt(0));

        DataClassTwo dataClassTwo = new DataClassTwo();
        dataClassTwo.setName("dataClassTwo");

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setData(dataClass);
        binding.setDataTwo(dataClassTwo);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                //your code here
                dataClass.observableInt.set(dataClass.observableInt.get() + 1);

            }
        }, 5000, 1000);
    }
}
