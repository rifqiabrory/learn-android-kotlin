package com.example.learnandroidkotlin.viewandviewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.learnandroidkotlin.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_and_viewgroup)

        supportActionBar?.title = "View And View Group"
    }
}
