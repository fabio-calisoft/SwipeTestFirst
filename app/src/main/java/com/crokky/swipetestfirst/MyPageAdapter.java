package com.crokky.swipetestfirst;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

class MyPageAdapter extends FragmentPagerAdapter {

    private static final String TAG = "fdlMyPageAdapter";


    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Log.d(TAG, "getItem, position:" + position);
        switch (position) {
            case 0:
                Fragment first = new FirstFragment();
                return first;
            case 1: // Fragment # 1 - This will show image
                Fragment second = new SecondFragment();
                return second;
            default:// Fragment # 2-9 - Will show list
                return null;
        }


    }

    @Override
    public int getCount() {
        return 2;
    }

}
