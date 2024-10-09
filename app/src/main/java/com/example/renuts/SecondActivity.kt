package com.example.renuts

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.renuts.databinding.ActivityMainBinding
import com.example.renuts.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val uname = intent.getStringExtra("uname")
        binding.showUname.text = "$uname"

        binding.btnKeluar.setOnClickListener {
            val intentToThirdActivity = Intent(this, ThirdActivity::class.java)
            startActivity(intentToThirdActivity)
            finish()
        }
    }
}