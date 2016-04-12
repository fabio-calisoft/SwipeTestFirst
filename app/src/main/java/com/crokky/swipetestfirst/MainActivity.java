package com.crokky.swipetestfirst;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.Button;


/*
 from:
 http://www.truiton.com/2013/05/android-fragmentpageradapter-example/
 */
public class MainActivity extends FragmentActivity implements View.OnClickListener   {

    private static String TAG = "fdlFragmentActivity";
    private Button next, previous;

    private MyPageAdapter pageAdapter;
    private ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");

        setContentView(R.layout.activity_main);

        next = (Button) findViewById(R.id.bnext);
        previous = (Button) findViewById(R.id.bprev);
        next.setOnClickListener(this);
        previous.setOnClickListener(this);


        pageAdapter = new MyPageAdapter(getSupportFragmentManager()   );
        mPager = (ViewPager) findViewById(R.id.fragmentspager);
        mPager.setAdapter(pageAdapter);


    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "onClick");
        /*
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (v == next) {
            Log.d(TAG, "onClick: next");
            Fragment newFragment = new SecondFragment();
            //remove whatever fragment in the container and use the SecondFragment
            fragmentTransaction.replace(R.id.fragment_container, newFragment);
            fragmentTransaction.addToBackStack(null);

            // Commit the transaction
            fragmentTransaction.commit();

        } else if (v == previous) {
            Log.d(TAG, "onClick: previous");
            Fragment newFragment = new FirstFragment();
            //remove whatever fragment in the container and use the SecondFragment
            fragmentTransaction.replace(R.id.fragment_container, newFragment);
            fragmentTransaction.addToBackStack(null);

            // Commit the transaction
            fragmentTransaction.commit();
        }
        */
    }

}
