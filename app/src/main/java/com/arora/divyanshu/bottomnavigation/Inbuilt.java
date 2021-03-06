package com.arora.divyanshu.bottomnavigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.arora.divyanshu.bottomnavigation.fragments.One;
import com.arora.divyanshu.bottomnavigation.fragments.Three;
import com.arora.divyanshu.bottomnavigation.fragments.Two;

public class Inbuilt extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment fragment = null;


            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragment = new One();
                    break;

                case R.id.navigation_dashboard:
                    fragment = new Two();
                    break;

                case R.id.navigation_notifications:
                    fragment = new Three();
                    break;
            }
            return loadFragment(fragment);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbuilt);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }




    private boolean loadFragment(Fragment fragment)
    {
        if (fragment !=null)
        {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container,fragment)
                    .commit();
            return true;
        }
        return false;
    }








}
