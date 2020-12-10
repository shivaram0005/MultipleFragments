package com.example.multiplefragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void process(View view) {
        switch (view.getId())
        {
            case R.id.mainButton1:
                loadfragment(new Fragment1());
                break;
            case R.id.mainButton2:
                loadfragment(new Fragment2());
                break;
            case R.id.mainButton3:
                loadfragment(new Fragment3());
                break;
        }

    }
    public void loadfragment(Fragment fragment)
    {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.mainFrame,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}