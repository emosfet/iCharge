package com.icharge.ui.profile;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.icharge.activity.R;

/**
 * Created by Jinsen on 15/5/23.
 */
public class ProfileFragment extends Fragment {

    public static ProfileFragment newInstance(){
        ProfileFragment fragment = new ProfileFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_profile, container, false);

        return rootview;
    }
}
