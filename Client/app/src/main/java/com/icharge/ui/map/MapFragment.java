package com.icharge.ui.map;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.icharge.activity.R;

/**
 * Created by Jinsen on 15/5/23.
 */
public class MapFragment extends Fragment {

    public MapFragment(){}

    public static MapFragment newInstance() {
        MapFragment fragment = new MapFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_map, container, false);

        return rootview;
    }


}