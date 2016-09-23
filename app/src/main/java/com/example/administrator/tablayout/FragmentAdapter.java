package com.example.administrator.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/4/17.
 */
public class FragmentAdapter extends FragmentPagerAdapter{
    private List<Fragment> list_fragment;                         //fragment列表
    private List<String> list_Title;                              //tab名的列表
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }


    public FragmentAdapter(FragmentManager fragmentManager, List<Fragment> list_fragment, List<String> list_title) {
        super(fragmentManager);
        this.list_fragment = list_fragment;
        this.list_Title =list_title;
    }

    @Override
    public Fragment getItem(int position) {
        return list_fragment.get(position);
    }

    @Override
    public int getCount() {
        return list_fragment.size();
    }
    //此方法用来显示tab上的名字
    @Override
    public CharSequence getPageTitle(int position) {

        return list_Title.get(position % list_Title.size());
    }
}
