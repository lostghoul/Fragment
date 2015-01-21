/**
 * Created by sunshaogang on 1/21/15.
 */
package com.sunshaogang.fragment.two;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

import com.sunshaogang.fragment.R;
import com.sunshaogang.fragment.one.OneContentFragment;

public class TwoActivity extends Activity implements OnClickListener {
    private Button mTabWeixin;
    private Button mTabFriend;

    private OneContentFragment mWeixin;
    private TwoContentFragment mFriend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.two_activity_layout);

        // 初始化控件和声明事件
        mTabWeixin = (Button) findViewById(R.id.tab_bottom_one);
        mTabFriend = (Button) findViewById(R.id.tab_bottom_two);
        mTabWeixin.setOnClickListener(this);
        mTabFriend.setOnClickListener(this);

        // 设置默认的Fragment
        setDefaultFragment();
    }

    private void setDefaultFragment() {
        Log.e("ssg","set Default Fragment");
        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        mWeixin = new OneContentFragment();
        transaction.replace(R.id.id_content, mWeixin);
        transaction.commit();
    }

    @Override
    public void onClick(View v) {
        FragmentManager fm = getFragmentManager();
        // 开启Fragment事务
        FragmentTransaction transaction = fm.beginTransaction();

        switch (v.getId()) {
            case R.id.tab_bottom_one:
                if (mWeixin == null) {
                    mWeixin = new OneContentFragment();
                }
                Log.e("ssg","click one");
                // 使用当前Fragment的布局替代id_content的控件
                transaction.replace(R.id.id_content, mWeixin);
                break;
            case R.id.tab_bottom_two:
                if (mFriend == null) {
                    mFriend = new TwoContentFragment();
                }
                Log.e("ssg","click two");
                transaction.replace(R.id.id_content, mFriend);
                break;
        }
        // transaction.addToBackStack();
        // 事务提交
        transaction.commit();
    }

}

