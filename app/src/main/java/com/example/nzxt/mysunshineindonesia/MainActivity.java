package com.example.nzxt.mysunshineindonesia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.weather_day_title)
    TextView weatherDayTitle;
    ImageView imgWeather;
    TextView weatherDesc;
    TextView weatherTemperature;
    RecyclerView weatherList;
    private WeatherAdapter weatherAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherDayTitle = (TextView) findViewById(R.id.weather_day_title);
        imgWeather = (ImageView) findViewById(R.id.img_weather);
        weatherDesc = (TextView) findViewById(R.id.weather_desc);
        weatherTemperature = (TextView) findViewById(R.id.weather_temperature);
        weatherList = (RecyclerView) findViewById(R.id.weather_list);

        ButterKnife.bind(this);

        weatherDayTitle.setText("Hari Minggu");
        weatherDesc.setText("Hari Terang Benderang");
        weatherTemperature.setText("30 Derajat aja");

        imgWeather.setImageResource(R.drawable.weather_img);

        weatherList.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        weatherAdapter = new WeatherAdapter();
        weatherList.setAdapter(weatherAdapter);


    }
}
