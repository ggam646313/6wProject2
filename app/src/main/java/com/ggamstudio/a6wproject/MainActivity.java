package com.ggamstudio.a6wproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

//    Button loginbtn;
//    ViewPager pager;
//    MyAdapter adapter;



//    private FragmentManager fragmentManager = getSupportFragmentManager();
//
//
//    private Fragment_home fragment_home = new Fragment_home();
//    private Fragment_search fragment_search = new Fragment_search();
//    private Fragment_upload fragment_upload = new Fragment_upload();
//    private Fragment_favorite fragment_favorite = new Fragment_favorite();
//    private Fragment_my fragment_my = new Fragment_my();
//
//    BottomNavigationView bnv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pager=findViewById(R.id.pager);
        //adapter= new MyAdapter(getSupportFragmentManager());
        //pager.setAdapter(adapter);

//        loginbtn.findViewById(R.id.loginBtn);
//
//        loginbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

//        bnv= findViewById(R.id.bnv);
//
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

    }

    public void clickLogin(View view) {

//        FragmentManager fragmentManager= getSupportFragmentManager();
//
//        FragmentTransaction ft= fragmentManager.beginTransaction();
//
//        Fragment1 fragment1= new Fragment1();
//
//        ft.add(R.id.tv_fragment1, fragment1);
//
//        ft.addToBackStack(null);
//
//        ft.commit();


    }
}
