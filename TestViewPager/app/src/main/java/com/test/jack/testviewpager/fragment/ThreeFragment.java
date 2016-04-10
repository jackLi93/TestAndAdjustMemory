package com.test.jack.testviewpager.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.test.jack.testviewpager.R;

/**
 * Created by jack on 2016/4/9.
 */
public class ThreeFragment extends Fragment {
    private  final static  String TAG ="ThreeFragment";

    private View rootView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = getActivity().getLayoutInflater().inflate(R.layout.fragmentone,container,false);
        //return super.onCreateView(inflater, container, savedInstanceState);
        Log.i(TAG, "oncreateView");
        return  rootView;
    }
}
