package com.example.punchhlenovo.viewpagerex;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by PUNCHHLENOVO on 12-07-2017.
 */

public class FragmentSlide extends Fragment {

    public static FragmentSlide newInstance() {
        Bundle args = new Bundle();
        FragmentSlide fragment = new FragmentSlide();
        fragment.setArguments(args);
        return fragment;
    }
}
