package com.example.punchhlenovo.viewpagerex;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by PUNCHHLENOVO on 11-07-2017.
 */

public class ScreenSlidePageFragment extends Fragment {

    protected ViewPager pager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_screen_slide_page, container, false);
        pager = (ViewPager) rootView.findViewById(R.id.vp_pages);
        return rootView;
    }

    public static ScreenSlidePageFragment newInstance() {
        Bundle args = new Bundle();
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
