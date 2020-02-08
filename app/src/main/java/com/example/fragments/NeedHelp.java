package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class NeedHelp extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_need_help, container, false);

        view.findViewById(R.id.project_idea_button).setOnClickListener(mListener);
        view.findViewById(R.id.dont_know_code_button).setOnClickListener(mListener);
        view.findViewById(R.id.need_team_button).setOnClickListener(mListener);
        view.findViewById(R.id.im_good_button).setOnClickListener(mListener);

        return view;
    }

    private final View.OnClickListener mListener = new View.OnClickListener() {
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.project_idea_button:
                    FragmentTransaction fr = getFragmentManager().beginTransaction();
                    fr.replace(R.id.fragment_container, new ProjectIdea());
                    fr.commit();
                    break;
                case R.id.dont_know_code_button:
                    FragmentTransaction fr2 = getFragmentManager().beginTransaction();
                    fr2.replace(R.id.fragment_container, new DontKnowCode());
                    fr2.commit();
                    break;
                case R.id.need_team_button:
                    FragmentTransaction fr3 = getFragmentManager().beginTransaction();
                    fr3.replace(R.id.fragment_container, new WanderAround());
                    fr3.commit();
                    break;
                case R.id.im_good_button:
                    FragmentTransaction fr4 = getFragmentManager().beginTransaction();
                    fr4.replace(R.id.fragment_container, new WanderAround());
                    fr4.commit();
                    break;
            }
        }
    };
}
