/**
 * Created by sunshaogang on 1/21/15.
 */
package com.sunshaogang.fragment.two;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sunshaogang.fragment.R;

public class TwoContentFragment extends Fragment {

    public TwoContentFragment(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        LinearLayout root = (LinearLayout) LayoutInflater.from(getActivity()).inflate(R.layout.two_content_fragment,null);
//        TextView text = (TextView) root.findViewById(R.id.content_text);
//        text.setText("1");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.two_content_fragment, container, false);
    }

}

