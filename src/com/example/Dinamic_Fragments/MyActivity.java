package com.example.Dinamic_Fragments;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;


public class MyActivity extends FragmentActivity {

    Fragment1 F1;
    Fragment2 F2;
    FragmentTransaction fTrans;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        F1 = new Fragment1();
        F2 = new Fragment2();


    }

    public void onClick(View v) {
        fTrans = getSupportFragmentManager().beginTransaction();
        switch (v.getId()) {
            case R.id.butMain1:
                fTrans.replace(R.id.frgmCont, F2);
                break;
            case R.id.butMain2:
                fTrans.replace(R.id.frgmCont, F2);
                break;
            case R.id.butMain3:
                fTrans.remove(F1);
                fTrans.remove(F2);
                break;

            default:
                break;
        }

        fTrans.commit();
    }
}