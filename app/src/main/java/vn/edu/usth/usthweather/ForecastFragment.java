/*
 * Copyright (c) 2025
 * All rights reserved.
 * Project: USTH Weather
 * File: ForecastFragment.java
 * Created: 8/9/2025 10:47
 * Last Modified: 8/9/2025 10:47
 */

package vn.edu.usth.usthweather;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


public class ForecastFragment extends Fragment {


    public ForecastFragment() {
        // Required empty public constructor

    }

    @SuppressLint("ResourceType")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate your layout
        ForecastFragment firstFragment = new ForecastFragment();
        assert getFragmentManager() != null;
        getFragmentManager().beginTransaction().add(
                R.layout.container, firstFragment).commit(); //TODO FIX LABWORK 3
        return inflater.inflate(R.layout.fragment_forecast, container, false);
    }

    public void CHANGEcolor(Integer color) {
        View view = getView();
        assert view != null;
        view.setBackgroundColor(color);
    }

}



