package com.example.booktrackerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.booktrackerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)


        //este contentView nos permite tener data binding y se declara en la parte de arriba, se ocupa setContentView porque estamos en una actividad
        binding = DataBindingUtil
            .setContentView(
                this,
                R.layout.activity_main)
    }
}
//en esta parte ya se ha activado el data binding para el main activity pero aun falta el del fragment
