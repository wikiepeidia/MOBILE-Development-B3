/*
 * Copyright (c) 2025 Pham The Minh
 * All rights reserved.
 * Project: USTH Weather
 * File: WeatherAndForecastFragment.java
 * Last Modified: 20/9/2025 2:36
 */

package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class WeatherAndForecastFragment extends Fragment {

    public WeatherAndForecastFragment() {
        // Required empty constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (savedInstanceState == null) {
            getChildFragmentManager().beginTransaction()
                    .replace(R.id.weather_container, new WeatherFragment())
                    .replace(R.id.forecast_container, new ForecastFragment())
                    .commit();
        }
    }

}


