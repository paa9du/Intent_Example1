package com.example.intent_example_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var firstName: TextView
    private lateinit var lastName: TextView
    private lateinit var Age: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

      //  getSupportActionBar()?.setTitle("Back Button");
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);

        firstName= findViewById<TextView>(R.id.first_name)
        lastName= findViewById<TextView>(R.id.last_name)
        Age= findViewById<TextView>(R.id.age)

        val fn= intent.getStringExtra("FIRST_NAME")
        val ln= intent.getStringExtra("LAST_NAME")
        val age= intent.getStringExtra("AGE")

        firstName.text = "First Name: $fn"
        lastName.text="Last Name: $ln"
        Age.text="Age: $age"

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed();
        return true;
    }
}