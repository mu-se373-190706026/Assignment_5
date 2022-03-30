package com.ensarturkes.assingment_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // use arrayadapter and define an array
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Ensar", "Zeynep", "Mustafa",
            "Agah", "Melih"
        )

        // access the listView from xml file
        var mListView = findViewById<ListView>(R.id.userlist)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter
        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)

        }
        val buttonAddImage = findViewById<Button>(R.id.button)
        buttonAddImage.setOnClickListener {
            val imageView = findViewById<ImageView>(R.id.picture)
            imageView.setImageResource(R.drawable.picture1)
        }
    }
}
