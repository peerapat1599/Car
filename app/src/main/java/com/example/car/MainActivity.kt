package com.example.car

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.car1_text -> view.setBackgroundColor(Color.RED)
            R.id.car2_text -> view.setBackgroundColor(Color.RED)
            R.id.car3_text -> view.setBackgroundColor(Color.RED)
        }
    }

    private fun show(view: View) {
        number.visibility = View.VISIBLE
        name.visibility = View.VISIBLE
        car.visibility = View.VISIBLE
        cancel.visibility = View.VISIBLE
        ok.visibility = View.VISIBLE
    }

    private fun hide(view: View) {
        number.visibility = View.GONE
        name.visibility = View.GONE
        car.visibility = View.GONE
        cancel.visibility = View.GONE
        ok.visibility = View.GONE
    }

    private fun setListeners() {
        val carOne = findViewById<TextView>(R.id.car1_text)
        val carTwo = findViewById<TextView>(R.id.car2_text)
        val carThree = findViewById<TextView>(R.id.car3_text)

        number.visibility = View.GONE
        name.visibility = View.GONE
        car.visibility = View.GONE
        cancel.visibility = View.GONE
        ok.visibility = View.GONE

        val clickableViews: List<View> =
            listOf(carOne, carTwo, carThree
            )
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
            item.setOnClickListener { show(it) }
        }
    }
}