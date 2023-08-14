package com.example.viewpager1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.viewpager1.databinding.ItemViewPagerBinding
import com.squareup.picasso.Picasso

class MyViewPagerAdapter(val list: List<Users>):PagerAdapter() {
    override fun getCount(): Int {
        return list.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val itemViewPagerBinding = ItemViewPagerBinding.inflate(LayoutInflater.from(container.context), container,false)

        var pos = position
        pos = list.size-1

        itemViewPagerBinding.btnNext.setOnClickListener {
            Picasso.get().load(list[pos].image).into(itemViewPagerBinding.img)
            itemViewPagerBinding.txt1.text = list[pos].name
            itemViewPagerBinding.txt2.text = list[pos].text
        }

        Picasso.get().load(list[pos].image).into(itemViewPagerBinding.img)
        itemViewPagerBinding.txt1.text = list[pos].name
        itemViewPagerBinding.txt2.text = list[pos].text


        container.addView(itemViewPagerBinding.root)
        return itemViewPagerBinding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view = `object` as View
        container.removeView(view)
    }

}