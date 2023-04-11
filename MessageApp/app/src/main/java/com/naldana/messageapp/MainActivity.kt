package com.naldana.messageapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var messageEditText: EditText
    private lateinit var messageEditText2: EditText
    private lateinit var messageEditText3: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        setupListeners()
    }

    private fun bind() {
        messageEditText = findViewById(R.id.message_text_input_edit)
        messageEditText2 = findViewById(R.id.message_text_input_edit2)
        messageEditText3 = findViewById(R.id.message_text_input_edit3)
    }

    private fun setupListeners() {
        onSend()
    }



    private fun onSend() {
        val sendButton = findViewById<Button>(R.id.action_send)
        sendButton.setOnClickListener {
            val intent = Intent(this, DataActivity::class.java)
            intent.putExtra(DataActivity.KEY_MESSAGE, messageEditText.text.toString())
            intent.putExtra(DataActivity.KEY_MESSAGE2, messageEditText2.text.toString())
            intent.putExtra(DataActivity.KEY_MESSAGE3, messageEditText3.text.toString())
            startActivity(intent)
        }
    }
}