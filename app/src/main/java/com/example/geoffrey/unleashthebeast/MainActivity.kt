package com.example.geoffrey.unleashthebeast

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick (v: View) {
        when(v.id){
            R.id.dashboard_btn -> moveToNextScreen()
        }
    }
    private fun moveToNextScreen() {
        val nextScreenIntent = Intent(this, DashboardActivity::class.java).apply {  }
        startActivity(nextScreenIntent)
    }
}
