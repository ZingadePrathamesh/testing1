package com.example.testing1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val richDadBtn: Button = findViewById(R.id.richdad_button)
        val AtomicHabitBtn: Button = findViewById(R.id.atomichabit_button)
        val DoEpicShitBtn: Button = findViewById(R.id.epic_shit_button)
        val FiveAmBtn: Button = findViewById(R.id.fiveam_button)


        richDadBtn.setOnClickListener(){ sendData("1", 0) }
        AtomicHabitBtn.setOnClickListener(){ sendData("1", 1) }
        DoEpicShitBtn.setOnClickListener(){ sendData("1", 2) }
        FiveAmBtn.setOnClickListener(){ sendData("1", 3) }
    }

    private fun sendData(name: String, data: Int) {
        var i: Intent = Intent(this@MainActivity, MainActivity2::class.java)
        i.putExtra(name, data)
        startActivity(i)
    }
}