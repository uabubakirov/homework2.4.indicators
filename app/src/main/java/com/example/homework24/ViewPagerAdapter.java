package com.example.homework24;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    List<OnBoardingModel> list = new ArrayList<>();

    public ViewPagerAdapter(List<OnBoardingModel> list,FragmentManager fm){
        super(fm);
        this.list = list;

    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
            case 1:
            case 2:
                return OnBoardFragmentItem.newInstance(list.get(position).getTxtTitle(),list.get(position).getTxtDescription(),list.get(position).getImg());

        }
        return null;
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
