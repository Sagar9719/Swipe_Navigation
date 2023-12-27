package com.example.swipe_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Find the view pager that will allow the user to swipe between fragments
        val viewPager = findViewById<ViewPager>(R.id.viewpager)

        //Create an adapter that knows which knows which fragment shown on each page
        val adapter = SimpleFragmentPageAdapter(supportFragmentManager)

        //Set the adapter on the view pager
        viewPager.adapter = adapter
    }
}