/*
 * Copyright (c) 2025
 * All rights reserved.
 * Project: USTH Weather
 * File: ForecastFragment.java
 * Created: 15/9/2025 9:8
 * Last Modified: 15/9/2025 9:8
 */

package vn.edu.usth.usthweather;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment {

    public ForecastFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Create a vertical LinearLayout programmatically
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));

        // Create TextView for day
        TextView dayTextView = new TextView(getContext());
        dayTextView.setText("Thursday");
        dayTextView.setTextSize(18);
        dayTextView.setPadding(16, 16, 16, 8);

        // Create ImageView for weather icon
        ImageView weatherIcon = new ImageView(getContext());
        weatherIcon.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));

        weatherIcon.setImageResource(R.drawable.partly_cloudy_day);


        // Add views to LinearLayout
        linearLayout.addView(dayTextView);
        linearLayout.addView(weatherIcon);

        // Set background color
        linearLayout.setBackgroundColor(Color.parseColor("#20FF0000")); // Red with transparency

        return linearLayout;
    }

    public void CHANGEcolor(Integer color) {
        View view = getView();
        if (view != null) {
            view.setBackgroundColor(color);
        }
    }
}
