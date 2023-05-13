package com.example.definition.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.definition.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialisePaging()

    }

    //функція ініціалізації, що звертається до PagerAdapter, що дозволяє перемикатись між фрагментами SearchFragment та FavoriteFragment
    private fun initialisePaging() {
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        viewPager.adapter = PagerAdapter(this)
        TabLayoutMediator(tabLayout, viewPager) { tab, pos ->
            when (pos) {
                0 -> tab.setIcon(R.drawable.ic_baseline_search_24)
                1 -> tab.setIcon(R.drawable.ic_baseline_favorite_24)
            }
        }.attach()
    }

}