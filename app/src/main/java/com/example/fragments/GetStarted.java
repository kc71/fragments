package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GetStarted extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_get_started, container, false);

        view.findViewById(R.id.im_confused_button).setOnClickListener(mListener);
        view.findViewById(R.id.know_what_doing_button).setOnClickListener(mListener);

        return view;
    }

    private final View.OnClickListener mListener = new View.OnClickListener() {
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.im_confused_button:
                    FragmentTransaction fr = getFragmentManager().beginTransaction();
                    fr.replace(R.id.fragment_container, new Confused());
                    fr.commit();
                    break;
                case R.id.know_what_doing_button:
                    FragmentTransaction fr2 = getFragmentManager().beginTransaction();
                    fr2.replace(R.id.fragment_container, new KnowWhatDoing());
                    fr2.commit();
                    break;
            }
        }
    };
}


