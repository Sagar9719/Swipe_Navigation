package com.example.swipe_navigation

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter

class SimpleFragmentPageAdapter(fm: FragmentManager?): FragmentStatePagerAdapter(fm!!, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                Fragment1()
            }
            1 -> {
                Fragment2()
            }
            else ->{
                Fragment3()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }
}