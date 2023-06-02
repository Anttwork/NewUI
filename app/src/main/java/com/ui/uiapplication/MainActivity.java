package com.ui.uiapplication;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationBarView;
import com.ui.uiapplication.databinding.ActivityMainBinding;

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

//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
        setContentView(R.layout.activity_main2);
        home_view = findViewById(R.id.home_view);
        radioGroup = findViewById(R.id.rg_vertical);
        pagelist=new ArrayList<>();

//        BottomNavigationView navView = findViewById(R.id.nav_view);
//        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications,R.id.navigation_my)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//        NavigationUI.setupWithNavController(binding.navView, navController);
//        navView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
//                navView.setSelectedItemId(item.getItemId());
//                switch (item.getItemId()) {
//                    case 1:
//                        Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
//                        break;
//                    case 2:
//                        Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
//                        break;
//                    case 3:
//                        Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
//                        break;
//                    case 4:
//                        Toast.makeText(MainActivity.this, "4", Toast.LENGTH_SHORT).show();
//                        break;
//                }
//                return true;
//            }
//        });
    }

}