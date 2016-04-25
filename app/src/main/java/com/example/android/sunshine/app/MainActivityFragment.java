package com.example.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] forecastArray = {
                "Today - Sunny - 88 / 63",
                "Tomorrow - Foggy - 70 / 40",
                "Weds - Cloudy - 72 / 63",
                "Thurs - Astroids - 75 / 65",
                "Fri - Heavy Rain - 65 / 56",
                "Sat - HELP TRAPPED IN WEATHER STATION - 60 / 51",
                "Sun - Sunny - 80 / 68"
        };
        return inflater.inflate(R.layout.fragment_main, container, false);

        String[] weekForecast;
        ArrayAdapter<String> mForecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast);
        View rootView;
        ListView listView = (ListView) rootView.findViewById(
                R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;

    }
}
