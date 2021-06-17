package com.example.finalpbm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.finalpbm.fragments.HomeFragments
//import com.example.finalpbm.fragments.HomeFragment
import com.example.finalpbm.fragments.LaporFragment
import com.example.finalpbm.fragments.ProfileFragment
import com.example.finalpbm.fragments.TimelineFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class Dashboard : AppCompatActivity() {

    private val homeFragments = HomeFragments()
    private val laporFragment = LaporFragment()
    private val profileFragment = ProfileFragment()
    private val timelineFragment = TimelineFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        replaceFragment(profileFragment)



        BottomNavigationView.OnNavigationItemSelectedListener{
            when(it.itemId){
            R.id.ic_home -> replaceFragment(homeFragments)
                R.id.ic_lapor -> replaceFragment(laporFragment)
                R.id.ic_akun -> replaceFragment(profileFragment)
        }
    true
        }
}

    private fun replaceFragment(fragment: Fragment){
        if(fragment !=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }

    }
}