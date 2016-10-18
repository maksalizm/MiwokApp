package com.example.pms.miwokapp;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by pms on 2016. 10. 18..
 */

public class MiwokFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[] { "Numbers", "Colors", "Family", "Phrases" };
    private Context context;


    public MiwokFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return NumbersFragment.newInstance(position);
        } else if (position == 1){
            return FamilyFragment.newInstance(position);
        } else if (position == 2){
            return ColorsFragment.newInstance(position);
        } else {
            return PhrasesFragment.newInstance(position);
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
