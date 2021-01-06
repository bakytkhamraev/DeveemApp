package com.example.deveemapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.deveemapp.ui.fragments.building.BuildingFragment
import com.example.deveemapp.ui.fragments.home.HomeFragment
import com.example.deveemapp.ui.fragments.technology.TechnologyFragment

class PagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getCount(): Int = 3

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment()
            }
            1 -> {
                TechnologyFragment()
            }
            2 -> {
                BuildingFragment()
            }
            else -> {
                HomeFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> {
                return "\uD83D\uDC04 Агробазар"
            }
            1 -> {
                return "\uD83D\uDE98 Сельхоз техника"
            }
            2 -> {
                return "\uD83D\uDEE0️ Строительные материалы"
            }
        }
        return super.getPageTitle(position)
    }
}