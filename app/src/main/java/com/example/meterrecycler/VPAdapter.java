package com.example.meterrecycler;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class VPAdapter extends FragmentStateAdapter {

    /*private final ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
    private final ArrayList<String> fragmentTitleList = new ArrayList<>();
*/

    public VPAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){

            case 1:
                return new Status();
            case 2:
                return new Calls();
            default:
                return new FragChat();
            }
    }

    @Override
    public int getItemCount() {
      //  return fragmentArrayList.size();
        return 3;
    }

    /*public void addFragment(Fragment fragment, String title){

        fragmentArrayList.add(fragment);
        fragmentTitleList.add(title);
    }

    public CharSequence getPageTitle(int position){
      return   fragmentTitleList.get(position);
    }*/
}
