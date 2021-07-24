package com.example.homework24;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager pager;
    ViewPagerAdapter adapter;
    TextView skip,next;
    ImageView imgFirst,imgSecond,imgThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = findViewById(R.id.view_pager);
        skip = findViewById(R.id.txt_skip);
        next = findViewById(R.id.txt_next);
        imgFirst = findViewById(R.id.img_first);
        imgSecond = findViewById(R.id.img_second);
        imgThird = findViewById(R.id.img_third);
        List<OnBoardingModel> list = new ArrayList<>();
        list.add(new OnBoardingModel("Hello World","sadkkdsa",R.drawable.rab));
        list.add(new OnBoardingModel("Hello World2","sadkkdsa",R.drawable.rab));
        list.add(new OnBoardingModel("Hello World3","sadkkdsa",R.drawable.rab));
        adapter = new ViewPagerAdapter(list,getSupportFragmentManager());
        pager.setAdapter(adapter);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);

            }
        });

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        imgFirst.setImageResource(R.drawable.indicator_selected);
                        imgSecond.setImageResource(R.drawable.indicator_unselected);
                        imgThird.setImageResource(R.drawable.indicator_unselected);
                        break;
                    case 1:
                        imgFirst.setImageResource(R.drawable.indicator_unselected);
                        imgSecond.setImageResource(R.drawable.indicator_selected);
                        imgThird.setImageResource(R.drawable.indicator_unselected);

                        break;
                    case 2:
                        imgFirst.setImageResource(R.drawable.indicator_unselected);
                        imgSecond.setImageResource(R.drawable.indicator_unselected);
                        imgThird.setImageResource(R.drawable.indicator_selected);
                        break;
                }
                if(position == 2){
                    next.setText("Finish");
                }else{
                    next.setText("Next");
                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pager.getCurrentItem() == 2){
                    Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent);
                }else {
                    pager.setCurrentItem(pager.getCurrentItem() + 1);
                }
                }
        });



    }
}