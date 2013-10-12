package com.example.Dinamic_Fragments;

/**
 * Created with IntelliJ IDEA.
 * User: Sergey
 * Date: 09.10.13
 * Time: 12:43
 * To change this template use File | Settings | File Templates.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment1 extends Fragment {

    TextView TextView1;
    Button Button1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //return inflater.inflate(R.layout.fragment1, null);
        View v = inflater.inflate(R.layout.fragment1, null);
        TextView1 = (TextView)v.findViewById(R.id.textView11);
        Button1 = (Button)v.findViewById(R.id.butt1);


        View.OnClickListener Knopk = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView1.setText("Вы в первом фрагменте");

            }
        };
        Button1.setOnClickListener(Knopk);

     return v;
    }
}
