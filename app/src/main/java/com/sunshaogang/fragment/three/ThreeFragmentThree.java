/**
 * Created by sunshaogang on 1/21/15.
 */
package com.sunshaogang.fragment.three;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.sunshaogang.fragment.R;

public class ThreeFragmentThree extends Fragment implements OnClickListener {

    private Button mBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.three_fragment, container, false);
        mBtn = (Button) view.findViewById(R.id.button);
        mBtn.setText("button in fragment three");
        mBtn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(), " i am a btn in Fragment three", Toast.LENGTH_SHORT).show();

        FragmentManager fm = getFragmentManager();
        Fragment fOne = fm.findFragmentByTag("ONE");
        if (!(fOne instanceof ThreeFragmentOne)){
            Log.e("ssg", "create a new fragment 1");
            fOne = new ThreeFragmentOne();
        }
        FragmentTransaction tx = fm.beginTransaction();
        tx.replace(R.id.id_content, fOne, "ONE");

        tx.addToBackStack(null);
        tx.commit();
    }

}
