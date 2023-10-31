package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val foodItems = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun handleDecideButtonClick(v: View?){
        val randonNumber = (0..foodItems.size).random()
        val foodItem = findViewById<TextView>(R.id.tvFoodItem)
        foodItem.text = foodItems.get(randonNumber)
    }

    fun handleAddFoodButtonClick(v: View?){
        val userFoodItem = findViewById<EditText>(R.id.etAddNewFood)
        foodItems.add("${userFoodItem.text}")
    }
}