package com.glunda.countryproject

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.cardview.widget.CardView

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        var bangladesh = findViewById<CardView>(R.id.card1);
        bangladesh.setOnClickListener{
            var  i = Intent(this@HomeActivity,Bangladesh::class.java)
            startActivity(i)
        }
        var india = findViewById<CardView>(R.id.card2);
        india.setOnClickListener{
            var  i = Intent(this@HomeActivity,India::class.java)
            startActivity(i)
        }

        var italy = findViewById<CardView>(R.id.card3);
        italy.setOnClickListener{
            var  i = Intent(this@HomeActivity,Italy::class.java)
            startActivity(i)
        }
    }
}