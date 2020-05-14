package com.example.challenge_1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.*
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    val menu_teks = arrayOf("Home","About")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val viewpager = findViewById(R.id.viewpager) as ViewPager2

        val adapter = ViewPagerAdapter(this)
        viewpager.setAdapter(adapter)
        TabLayoutMediator(tab_layout, viewpager, TabLayoutMediator.TabConfigurationStrategy { tab, position ->
            tab.text = menu_teks[position]
        }).attach()
    }
}
