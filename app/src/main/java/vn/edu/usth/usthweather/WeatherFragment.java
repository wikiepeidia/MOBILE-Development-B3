/*
 * Copyright (c) 2025 Pham The Minh
 * All rights reserved.
 * Project: USTH Weather
 * File: WeatherFragment.java
 * Last Modified: 20/9/2025 2:15
 */

package vn.edu.usth.usthweather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class WeatherFragment extends Fragment {

    public WeatherFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for WeatherFragment
        return inflater.inflate(R.layout.fragment_weather, container, false);
    }
}
