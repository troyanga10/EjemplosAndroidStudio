package org.uab.dedam.todoman;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Display;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;


public class HomeActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        if (savedInstanceState == null) {

            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();

            HomeActivityFragment cFragment = new HomeActivityFragment();
            NewTaskActivityFragment cFragment2=new NewTaskActivityFragment();

            if (findViewById(R.id.fragment1Container) != null) {
                transaction.add(R.id.fragment1Container, cFragment);
                transaction.add(R.id.fragment2Container, cFragment2);
            }

            else {
                transaction.add(R.id.fragment1Container, cFragment);
                Button gotoSubactivity = (Button) findViewById(R.id.newTask);
                gotoSubactivity.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(HomeActivity.this, NewTaskActivity.class);
                        startActivity(intent);
                    }
                });
            }

            transaction.commit();
        }
    }


    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();

        WindowManager wm = getWindowManager();
        Display d = wm.getDefaultDisplay();

        if (d.getRotation() == Surface.ROTATION_90){
            HomeActivityFragment fragment1 = new HomeActivityFragment();
            fragmentTransaction.replace(R.id.fragment1Container, fragment1)
                    .commit();
        }else {
            HomeActivityFragment fragment1 = new HomeActivityFragment();
            NewTaskActivityFragment fragment2 = new NewTaskActivityFragment();
            fragmentTransaction.replace(R.id.fragment1Container, fragment1);
            fragmentTransaction.replace(R.id.fragment2Container, fragment2)
                    .commit();
        }

    }*/

}
