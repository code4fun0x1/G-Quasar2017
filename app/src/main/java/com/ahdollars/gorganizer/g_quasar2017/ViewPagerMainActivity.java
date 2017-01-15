package com.ahdollars.gorganizer.g_quasar2017;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class ViewPagerMainActivity extends AppCompatActivity {

    ViewPager pager;
    Toolbar toolbar;
    TabLayout tablayout;
    CoordinatorLayout coordinator;
    MyAdapter adapter;
    FragmentManager manager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_main);

        //initialize all the widgets
        initialize();

    }

    private void initialize() {
        coordinator=(CoordinatorLayout)findViewById(R.id.main_layout);
        tablayout=(TabLayout)findViewById(R.id.tablayout);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        pager=(ViewPager)findViewById(R.id.viewpager);
        manager=getSupportFragmentManager();
        adapter=new MyAdapter(manager);
        setSupportActionBar(toolbar);
        pager.setAdapter(adapter);
        tablayout.setupWithViewPager(pager);
        pager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));
        tablayout.setTabsFromPagerAdapter(adapter);

    }


    class MyAdapter extends FragmentPagerAdapter {

        FragmentManager m;

        public MyAdapter(FragmentManager fm) {
            super(fm);
            m=fm;
        }

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment=null;
            if(position==0){
                if(m.findFragmentByTag("ZERO")==null) {
                    fragment = new GquasarFragment();

                }else{
                    fragment=(GquasarFragment)m.findFragmentByTag("ZERO");
                }
            }
            if(position==1){
                if(m.findFragmentByTag("ONE")==null) {
                    fragment = new EventsFragment();

                }else{
                    fragment=(EventsFragment)m.findFragmentByTag("ONE");
                }
            }
            if(position==2){
                if(m.findFragmentByTag("TWO")==null) {
                    fragment = new ContactFragment();
                }else{
                    fragment=(ContactFragment)m.findFragmentByTag("TWO");
                }
            }
            if(position==3){
                if(m.findFragmentByTag("THREE")==null) {
                    fragment = new TeamFragment();
                }else{
                    fragment=(TeamFragment)m.findFragmentByTag("THREE");
                }
            }
            if(position==4){
                if(m.findFragmentByTag("FOUR")==null) {
                    fragment = new RegisterFragment();
                }else{
                    fragment=(RegisterFragment)m.findFragmentByTag("FOUR");
                }
            }
            return fragment=new GquasarFragment();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if(position==0){
                return "G-QUASAR";
            }
            if(position==1){
                return "EVENTS";
            }
            if(position==2){
                return "CONTACT";
            }
            if(position==3){
                return "TEAM";
            }
            return "REGISTER";
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if(id==R.id.exit){
            finish();
        }
        return false;
    }



}
