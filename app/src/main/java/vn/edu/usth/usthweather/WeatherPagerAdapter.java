/*
 * Copyright (c) 2025 Pham The Minh
 * All rights reserved.
 * Project: USTH Weather
 * File: WeatherPagerAdapter.java
 * Last Modified: 20/9/2025 2:36
 */

package vn.edu.usth.usthweather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class WeatherPagerAdapter extends FragmentStateAdapter {

    public WeatherPagerAdapter(@NonNull FragmentActivity activity) {
        super(activity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return new WeatherAndForecastFragment(); // reuse for each page
    }

    @Override
    public int getItemCount() {
        return 3; // 3 pages
    }
}
