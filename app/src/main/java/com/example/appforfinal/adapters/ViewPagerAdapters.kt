package com.example.appforfinal.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.appforfinal.Fragments.FragmentForViewPager
import com.example.appforfinal.Fragments.HomeFragment
import com.example.appforfinal.Fragments.ProfileFragment
import com.example.appforfinal.Fragments.UploadImageFragment

class ViewPagerAdapters(activity: FragmentForViewPager) : FragmentStateAdapter(activity) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        if (position == 0) {
            return HomeFragment()
        } else if (position == 1) {
            return UploadImageFragment()
        } else {
            return ProfileFragment()
        }

    }
}