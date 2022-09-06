package com.example.thirdmfiftyhm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thirdmfiftyhm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var sum = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlus.setOnClickListener {
            if (sum == 10 || binding.btnPlus.text.equals("-1")) {
                binding.btnPlus.text = "-1"
                sum--
                binding.textview.text = sum.toString()
                if (sum == 0) {
                    val intent = Intent(this,SecondActivity::class.java)
                    startActivity(intent)
                    binding.btnPlus.text = "+1"
                }
            } else {
                sum++
                binding.textview.text = sum.toString()
            }
        }
    }
}