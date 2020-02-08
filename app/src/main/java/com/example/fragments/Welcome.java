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


public class Welcome extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);

        view.findViewById(R.id.what_hack_button).setOnClickListener(mListener);
        view.findViewById(R.id.know_hack_button).setOnClickListener(mListener);

        return view;
    }

    private final View.OnClickListener mListener = new View.OnClickListener() {
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.what_hack_button:
                    FragmentTransaction fr = getFragmentManager().beginTransaction();
                    fr.replace(R.id.fragment_container, new WhatHackathon());
                    fr.commit();
                    break;
                case R.id.know_hack_button:
                    FragmentTransaction fr2 = getFragmentManager().beginTransaction();
                    fr2.replace(R.id.fragment_container, new GetStarted());
                    fr2.commit();
                    break;
            }
        }
    };
}

//public class Welcome extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        Button whatHack=(Button) findViewById(R.id.what_hack_button);
//        Button knowHack=(Button) findViewById(R.id.know_hack_button);
//
//        whatHack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Welcome.this,WhatHackathon.class);
//                startActivity(intent);
//            }
//        });
//
//        knowHack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Welcome.this,GetStarted.class);
//                startActivity(intent);
//            }
//        });
//    }
//
//}
