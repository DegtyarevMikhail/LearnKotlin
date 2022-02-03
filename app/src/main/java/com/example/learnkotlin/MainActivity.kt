package com.example.learnkotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.ProcessBuilder.Redirect.to


class MainActivity : AppCompatActivity() {
    val dataClass = DataClass("Alexandra", "LastName")
    val copy = dataClass.copy("Oleg")
    val dataWeather = DataWeather("Moscow", -7)
    val copyWeather = dataWeather.copy("Vladimir", -8)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text1 = findViewById<TextView>(R.id.data)
        val textCopy = findViewById<TextView>(R.id.data_copy)

        val button = findViewById<Button>(R.id.button_btn)
        button.setOnClickListener {
            Toast.makeText(this, "My Famaly name", Toast.LENGTH_SHORT).show()
            text1.text = dataClass.firstName + " " + dataClass.lastName
            textCopy.text = copy.firstName + " " + dataClass.lastName
        }



        val firstCity = findViewById<TextView>(R.id.first_town)
        val secondCity = findViewById<TextView>(R.id.second_town)

        val buttonWeather = findViewById<Button>(R.id.weather_btn)
        buttonWeather.setOnClickListener {
            Toast.makeText(this, "Wether", Toast.LENGTH_SHORT).show()
            firstCity.text = dataWeather.town + " " + dataWeather.temperature
            secondCity.text = copyWeather.town + " " + copyWeather.temperature
        }

    }

}