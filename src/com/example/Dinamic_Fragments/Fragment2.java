package com.example.Dinamic_Fragments;

/**
 * Created with IntelliJ IDEA.
 * User: Sergey
 * Date: 09.10.13
 * Time: 12:43
 * To change this template use File | Settings | File Templates.
 */

//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment2 extends Fragment {
    TextView TextView2;
    Button Button2;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment2, null);
        View d = inflater.inflate(R.layout.fragment2, null);
        TextView2 = (TextView)d.findViewById(R.id.textView22);
        Button2 = (Button)d.findViewById(R.id.butt2);


        View.OnClickListener Knopk2 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView2.setText("Вы во втором фрагменте");

            }
        };
        Button2.setOnClickListener(Knopk2);

        return d;




    }
}