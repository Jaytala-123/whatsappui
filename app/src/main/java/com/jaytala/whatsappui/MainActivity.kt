package com.jaytala.whatsappui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jaytala.whatsappui.Adapter.FragAdapter
import com.jaytala.whatsappui.databinding.ActivityMainBinding
import com.jaytala.whatsappui.fragement.CallsFragment
import com.jaytala.whatsappui.fragement.ChatFragment
import com.jaytala.whatsappui.fragement.StatusFragment

class MainActivity : AppCompatActivity() {

        var images = arrayOf(R.drawable.pro5,R.drawable.nature2,R.drawable.nature3,R.drawable.nature4,R.drawable.nature5,)
        var fragments = arrayOf(ChatFragment(),StatusFragment(),CallsFragment())
        var titles = arrayOf("CHATS","STATUS","CALLS")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tabs.addTab(binding.tabs.newTab().setText("CHAT"))
        binding.tabs.addTab(binding.tabs.newTab().setText("STATUS"))
        binding.tabs.addTab(binding.tabs.newTab().setText("CALL"))

        var adapter = FragAdapter(supportFragmentManager,fragments,titles)
        binding.vpImageSlider.adapter = adapter
        binding.tabs.setupWithViewPager(binding.vpImageSlider)



    }
}