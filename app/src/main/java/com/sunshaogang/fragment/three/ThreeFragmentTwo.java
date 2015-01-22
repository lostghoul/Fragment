/**
 * Created by sunshaogang on 1/21/15.
 */
package com.sunshaogang.fragment.three;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.sunshaogang.fragment.R;

public class ThreeFragmentTwo extends Fragment implements OnClickListener {

    private Button mBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.three_fragment, container, false);
        mBtn = (Button) view.findViewById(R.id.button);
        mBtn.setText("button in fragment two");
        mBtn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        FragmentManager fm = getFragmentManager();
        Fragment fThree = fm.findFragmentByTag("THREE");
//        if (!(fThree instanceof ThreeFragmentThree)){
            fThree = new ThreeFragmentThree();
//        }
        FragmentTransaction tx = fm.beginTransaction();
        tx.hide(this);
//        tx.add(R.id.id_content, fThree, "THREE");
		tx.replace(R.id.id_content, fThree, "THREE");
        tx.addToBackStack(null);
        tx.commit();
    }


}
