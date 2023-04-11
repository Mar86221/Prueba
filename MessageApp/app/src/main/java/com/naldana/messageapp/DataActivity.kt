package com.naldana.messageapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DataActivity : AppCompatActivity() {

    companion object {
        const val KEY_MESSAGE = "KEY_MESSAGE"
        const val KEY_MESSAGE2 = "KEY_MESSAGE2"
        const val KEY_MESSAGE3 = "KEY_MESSAGE3"
    }

    private lateinit var messageTextView: TextView
    private lateinit var messageTextView2: TextView
    private lateinit var messageTextView3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        bind()
        getIntentData()
    }

    private fun bind() {
        messageTextView = findViewById(R.id.message_text_view)
        messageTextView2 = findViewById(R.id.message_text_view2)
        messageTextView3 = findViewById(R.id.message_text_view3)
    }

    private fun getIntentData() {
        val message = intent.getStringExtra(KEY_MESSAGE)
        val message2 = intent.getStringExtra(KEY_MESSAGE2)
        val message3 = intent.getStringExtra(KEY_MESSAGE3)
        messageTextView.text =
            if (message.isNullOrBlank()) getString(R.string.empty_message) else message
        messageTextView2.text =
            if (message2.isNullOrBlank()) getString(R.string.empty_message) else message2
        messageTextView3.text =
            if (message3.isNullOrBlank()) getString(R.string.empty_message) else message3


    }
}