package com.example.prac3_r;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    LogInFragment logInFragment = new LogInFragment();
    ProfileFragment profileFragment = new ProfileFragment();
    SignUpFragment signUpFragment = new SignUpFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view, logInFragment)
                    .commit();
        }
    }

    public void replaceFragments(Fragment inst) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container_view, inst).commit();
    }
}