package com.example.administrator.tablayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    private TabLayout tab_FindFragment_title;
    private ViewPager vp_FindFragment_pager;
    private FragmentPagerAdapter fAdapter;

    private List<Fragment> list_fragment;
    private List<String> list_title;

    private Fragment3 fragment3;
    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment4 fragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        initControls();

    }

    private void initControls() {
        tab_FindFragment_title = (TabLayout) findViewById(R.id.tab_FindFragment_title);
        vp_FindFragment_pager = (ViewPager) findViewById(R.id.vp_FindFragment_pager);

        fragment3 = new Fragment3();
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment4 = new Fragment4();

        list_fragment = new ArrayList<>();
        list_fragment.add(fragment3);
        list_fragment.add(fragment1);
        list_fragment.add(fragment2);
        list_fragment.add(fragment4);

        list_title = new ArrayList<>();
        list_title.add("fragment1");
        list_title.add("fragment2");
        list_title.add("fragment3");
        list_title.add("fragment4");

        tab_FindFragment_title.setTabMode(TabLayout.MODE_FIXED);
        //为TabLayout添加tab名称
        tab_FindFragment_title.addTab(tab_FindFragment_title.newTab().setText(list_title.get(0)));
        tab_FindFragment_title.addTab(tab_FindFragment_title.newTab().setText(list_title.get(1)));
        tab_FindFragment_title.addTab(tab_FindFragment_title.newTab().setText(list_title.get(2)));
        tab_FindFragment_title.addTab(tab_FindFragment_title.newTab().setText(list_title.get(3)));

        fAdapter = new FragmentAdapter(getSupportFragmentManager(), list_fragment, list_title);

        vp_FindFragment_pager.setAdapter(fAdapter);

        tab_FindFragment_title.setupWithViewPager(vp_FindFragment_pager);

    }

}
