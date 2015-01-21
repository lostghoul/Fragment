package com.sunshaogang.fragment.one;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.sunshaogang.fragment.R;

/**
 * Created by sunshaogang on 1/21/15.
 */


public class OneActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.one_activity_layout);
    }

}

