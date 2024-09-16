// MainActivity.kt
package com.example.greetingcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonExplicit: Button = findViewById(R.id.buttonExplicit)
        val buttonImplicit: Button = findViewById(R.id.buttonImplicit)

        buttonExplicit.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        buttonImplicit.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setClass(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
