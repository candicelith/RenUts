package com.example.renuts

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.renuts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            val unameInput = binding.uname.text.toString()

            if (fieldNotEmpty()) {
                val intentToSecondActivity = Intent(this, SecondActivity::class.java)
                intentToSecondActivity.putExtra("uname", unameInput)
                startActivity(intentToSecondActivity)
                finish()
            } else {
                Toast.makeText(this, "Enter your name first", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun fieldNotEmpty(): Boolean {
        with(binding) {
            if (uname.text.toString()!="") {
                return true
            } else {
                return false
            }
        }
    }

}