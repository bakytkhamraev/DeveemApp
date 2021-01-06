package com.example.deveemapp.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.deveemapp.R
import com.example.deveemapp.adapter.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pager.adapter = PagerAdapter(supportFragmentManager)
        tab_layout.setupWithViewPager(pager)
    }
}