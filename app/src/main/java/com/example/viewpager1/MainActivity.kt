package com.example.viewpager1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TableLayout
import com.example.viewpager1.databinding.ActivityMainBinding
import com.example.viewpager1.databinding.ItemTabBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myViewPagerAdapter: MyViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        MyData.addUsers()

        myViewPagerAdapter = MyViewPagerAdapter(MyData.list)
        binding.myViewPager.adapter = myViewPagerAdapter



        binding.tabLayout.setupWithViewPager(binding.myViewPager)
        loadData()
    }

    fun loadData(){
        val tabCount = binding.tabLayout.tabCount

        for (i in 0 until tabCount){
            val itemTabBinding = ItemTabBinding.inflate(layoutInflater)
            val tab = binding.tabLayout.getTabAt(i)
            tab?.setCustomView(itemTabBinding.root)

        }

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.view?.findViewById<LinearLayout>(R.id.tab_indecator)?.alpha = 1.0f
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                tab?.view?.findViewById<LinearLayout>(R.id.tab_indecator)?.alpha = 0.1f
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })
    }
}