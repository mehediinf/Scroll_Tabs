package com.example.scroll_tabs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.pager_Id);


        FragmentManager fragmentManager = getSupportFragmentManager();
        CustomAdapter adapter = new CustomAdapter(fragmentManager);
        viewPager.setAdapter(adapter);


    }
}

class CustomAdapter extends FragmentStatePagerAdapter{


    public CustomAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        if (position==0){
            fragment= new Fragment_One();

        }
        if (position==1){
            fragment= new Fragment_Two();

        }
        if (position==2){
            fragment= new Fragment_Three();

        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

//Page Title code

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if (position==0){
            return "Tab-1";

        }
        if (position==1){
            return "Tab-2";

        }
        if (position==2){
            return "Tab-3";

        }

        return super.getPageTitle(position);
    }
}