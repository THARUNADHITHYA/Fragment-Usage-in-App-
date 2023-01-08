package com.example.fragmentusage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView home_img,school_img,contact_img;
    FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().hide();

        home_img = findViewById(R.id.home_img);
        school_img = findViewById(R.id.education_img);
        contact_img = findViewById(R.id.contact_img);

        frameLayout = findViewById(R.id.frame);

        //to set default frame

        setHomefragment();


        home_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    setHomefragment();
            }


        });

        school_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setEducationfragment();
            }
        });


        contact_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContactfragment();
            }
        });


    }

    public void setHomefragment()
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new HomeFragment()).commit();
    }

    public void setEducationfragment()
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new EducationFragment()).commit();
    }

    public void setContactfragment()
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new ContactFragment()).commit();
    }
}