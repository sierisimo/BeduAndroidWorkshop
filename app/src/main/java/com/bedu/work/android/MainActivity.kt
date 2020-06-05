package com.bedu.work.android

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_count_clicks)

        val clickButton = findViewById<Button>(R.id.buttonClick)
        val messageTextView = findViewById<TextView>(R.id.textViewClickMessage)

        messageTextView.text = getString(R.string.given_clicks, counter)

        clickButton.setOnClickListener {
            counter++
            messageTextView.text = getString(R.string.given_clicks, counter)
        }
    }
}