package com.ggamstudio.a6wproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Fragment1 extends Fragment {

//    TextView tv;

//    private FragmentManager fragmentManager = getChildFragmentManager();
//
//
//    private Fragment_home fragment_home = new Fragment_home();
//    private Fragment_search fragment_search = new Fragment_search();
//    private Fragment_upload fragment_upload = new Fragment_upload();
//    private Fragment_favorite fragment_favorite = new Fragment_favorite();
//    private Fragment_my fragment_my = new Fragment_my();

//    BottomNavigationView bnv;

//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        bnv= getView().findViewById(R.id.bnv);

//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.replace(R.id.frame_layout, fragment_home).commitAllowingStateLoss();
//
//        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//                FragmentTransaction transaction = fragmentManager.beginTransaction();
//
//                switch (item.getItemId()) {
//                    case R.id.bnv_home: {
//                        transaction.replace(R.id.frame_layout, fragment_home).commitAllowingStateLoss();
//                        break;
//                    }
//                    case R.id.bnv_search: {
//                        transaction.replace(R.id.frame_layout, fragment_search).commitAllowingStateLoss();
//                        break;
//                    }
//                    case R.id.bnv_upload: {
//                        transaction.replace(R.id.frame_layout, fragment_upload).commitAllowingStateLoss();
//                        break;
//                    }
//                    case R.id.bnv_favorite: {
//                        transaction.replace(R.id.frame_layout, fragment_favorite).commitAllowingStateLoss();
//                        break;
//                    }
//                    case R.id.bnv_my:{
//                        transaction.replace(R.id.frame_layout, fragment_my).commitAllowingStateLoss();
//                        break;
//                    }
//                }
//
//
//                return true;
//            }
//        });

//    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_1,container,false);

        return view;
    }
}
