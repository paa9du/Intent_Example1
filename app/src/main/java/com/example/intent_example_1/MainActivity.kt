package com.example.intent_example_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var firstName: EditText
    private lateinit var lastName: EditText
    private lateinit var Age: EditText
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstName= findViewById<EditText>(R.id.first_name)
        lastName= findViewById<EditText>(R.id.last_name)
        Age= findViewById<EditText>(R.id.age)
        button= findViewById<Button>(R.id.button)

        button.setOnClickListener {
            var fn = firstName.text.toString()
            var ln = lastName.text.toString()
            var age = Age.text.toString()

            val text="your Details Visible in the Next Screen"
            val duration= Toast.LENGTH_SHORT
            val toast=Toast.makeText(this,text,duration).show()


            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("FIRST_NAME", fn)
            intent.putExtra("LAST_NAME", ln)
            intent.putExtra("Age", age)
            startActivity(intent)
        }
    }
}