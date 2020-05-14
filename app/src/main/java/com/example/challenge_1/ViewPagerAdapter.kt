package com.example.challenge_1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity){
    private val menu = 2
    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> { return HomeFragment() }
            1 -> { return AboutFragment() }
            else -> {
                return HomeFragment()
            }
        }
    }
    override fun getItemCount(): Int {
        return menu
    }
}