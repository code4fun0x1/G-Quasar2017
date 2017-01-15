package com.ahdollars.gorganizer.g_quasar2017;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Shashank on 15-01-2017.
 */

public class GquasarFragment extends Fragment {

    View mainView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mainView=inflater.inflate(R.layout.fragment_home,container,false);
        mainView.setTag("ZERO");
        return mainView;
    }
}
