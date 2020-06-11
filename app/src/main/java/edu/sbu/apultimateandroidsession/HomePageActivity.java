package edu.sbu.apultimateandroidsession;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomePageActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottomNavigation = this.findViewById(R.id.button_nav);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        Toast.makeText(getApplicationContext(), "CLICKED ON HOME ", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.nav_chat:
                        Toast.makeText(getApplicationContext(), "CLICKED ON Chat ", Toast.LENGTH_LONG).show();
                        break;
                }
                return true;
            }
        });
    }
}
