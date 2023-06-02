package com.ui.uiapplication;

import android.os.Bundle;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.ui.uiapplication.ui.dashboard.MatchFragment;
import com.ui.uiapplication.ui.home.HomeFragment;
import com.ui.uiapplication.ui.my.MyFragment;
import com.ui.uiapplication.ui.notifications.AttentionFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //    private ActivityMainBinding binding;
    private ViewPager home_view;
    private RadioGroup radioGroup;


    private List<Fragment> pagelist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        home_view = findViewById(R.id.home_view);
        radioGroup = findViewById(R.id.rg_vertical);
        pagelist = new ArrayList<>();
        //为viewpager设置适配器
        pagelist = new ArrayList<>();
        pagelist.add(new HomeFragment());
        pagelist.add(new MatchFragment());
        pagelist.add(new AttentionFragment());
        pagelist.add(new MyFragment());
    }

}