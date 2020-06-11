package edu.sbu.apultimateandroidsession;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import edu.sbu.apultimateandroidsession.ui.chat.ChatFragment;
import edu.sbu.apultimateandroidsession.ui.home.HomeFragment;

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
                        HomeFragment fragment1 = new HomeFragment();
                        Bundle data = new Bundle();
                        data.putString("STR1", "SALAM MAN STR1 Hastam");
                        fragment1.setArguments(data);
                        openFragment(fragment1);
                        break;
                    case R.id.nav_chat:
                        ChatFragment fragment2 = new ChatFragment();
                        openFragment(fragment2);
                        break;
                }
                return true;
            }
        });
    }

    public void openFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
//        transaction.addToBackStack(null);
        transaction.commit();
    }
}
