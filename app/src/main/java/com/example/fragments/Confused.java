package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Confused extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.confused, container, false);

        view.findViewById(R.id.ask_help_button).setOnClickListener(mListener);
        view.findViewById(R.id.wander_around_button).setOnClickListener(mListener);

        return view;
    }

    private final View.OnClickListener mListener = new View.OnClickListener() {
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.ask_help_button:
                    FragmentTransaction fr = getFragmentManager().beginTransaction();
                    fr.replace(R.id.fragment_container, new NeedHelp());
                    fr.commit();
                    break;
                case R.id.wander_around_button:
                    FragmentTransaction fr2 = getFragmentManager().beginTransaction();
                    fr2.replace(R.id.fragment_container, new WanderAround());
                    fr2.commit();
                    break;
            }
        }
    };
}
