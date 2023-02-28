package com.jaytala.whatsappui.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class FragAdapter(manager: FragmentManager, fragments: Array<Fragment>, titles: Array<String>) : FragmentStatePagerAdapter(manager) {

    var fragments: Array<Fragment> = fragments
     var titles: Array<String> = titles

    override fun getCount(): Int {

        return fragments.size

    }

    override fun getItem(position: Int): Fragment {
        return fragments.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles.get(position)
    }
}