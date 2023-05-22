package com.mjolnir.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mjolnir.loginpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun initUI(){
        binding.fabBack.setOnClickListener {


        }
        binding.btnSignIn.setOnClickListener {


        }
        binding.tvForgetPassword.setOnClickListener {


        }
        binding.tvSignUp.setOnClickListener {


        }

    }
}