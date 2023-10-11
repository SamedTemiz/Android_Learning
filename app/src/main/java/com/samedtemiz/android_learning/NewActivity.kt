package com.samedtemiz.android_learning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.samedtemiz.android_learning.databinding.ActivityNewBinding

class NewActivity : AppCompatActivity() {

    private lateinit var binding : ActivityNewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment
        val navController = navHostFragment.navController

        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottom_navbar)

        bottomNavigationView.setupWithNavController(navController)
    }
}