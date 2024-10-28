package com.example.greetingcard

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val challenges = listOf(
            "Managing Requirements",
            "Ensuring Software Quality",
            "Handling Project Scope",
            "Time Management",
            "Team Communication"
        )

        val buttonMainActivity: Button = findViewById(R.id.buttonMainActivity)
        val listView: ListView = findViewById(R.id.listViewChallenges) // Assuming you have a ListView in your layout

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, challenges)
        listView.adapter = adapter // This is required to display the list

        buttonMainActivity.setOnClickListener {
            finish() // This will return to the MainActivity
        }
    }
}
