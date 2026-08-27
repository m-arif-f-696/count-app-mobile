package com.example.countapp

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.countapp.databinding.ActivityMainBinding

// create variable for save binding

private lateinit var binding: ActivityMainBinding
var counter = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // init binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        // set content from activity for use binding view root
        setContentView(binding.root)

        // now we can access UI Element in code
        with(binding){
            // access UI by id

            tvNumber.text = counter.toString()

            // if button count click
            btnCount.setOnClickListener {
                counter++
                tvNumber.text = counter.toString()
            }
            // if button toast click
            btnToast.setOnClickListener {
                Toast
                    .makeText(
                    this@MainActivity,
                    "Counter: $counter",
                    Toast.LENGTH_SHORT
                    )
                    .show()
            }

        }

    }
}