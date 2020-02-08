package com.example.fragments;

import com.example.fragments.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class WanderAround extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wander_around, container, false);

        view.findViewById(R.id.yes_button).setOnClickListener(mListener);
        view.findViewById(R.id.no_button).setOnClickListener(mListener);

        return view;
    }

    private final View.OnClickListener mListener = new View.OnClickListener() {
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.yes_button:
                    FragmentTransaction fr = getFragmentManager().beginTransaction();
                    fr.replace(R.id.fragment_container, new StillNeedHelp());
                    fr.commit();
                    break;
                case R.id.no_button:
                    FragmentTransaction fr2 = getFragmentManager().beginTransaction();
                    fr2.replace(R.id.fragment_container, new GoodLuck());
                    fr2.commit();
                    break;
            }
        }
    };
}


