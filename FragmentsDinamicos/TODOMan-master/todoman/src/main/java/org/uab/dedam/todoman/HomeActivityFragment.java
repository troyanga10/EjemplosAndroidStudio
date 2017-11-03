package org.uab.dedam.todoman;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class HomeActivityFragment extends Fragment {


    public HomeActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home_activity, container, false);
        View layoutView = inflater.inflate(R.layout.fragment_home_activity, container, false);
        return layoutView;
    }

}
