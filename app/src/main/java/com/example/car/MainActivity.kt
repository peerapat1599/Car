package com.example.car

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    private var car:Car = Car("A","B","C")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
        val car1 = findViewById<TextView>(R.id.car1_text)
        val car2 = findViewById<TextView>(R.id.car2_text)
        val car3 = findViewById<TextView>(R.id.car3_text)
        car1.setOnClickListener{
            show(it)
        }
        car2.setOnClickListener{
            show(it)
        }
        car3.setOnClickListener{
            show(it)
        }
    }

    private fun show(view: View){
        val car1 = findViewById<TextView>(R.id.car1_text)
        val car2 = findViewById<TextView>(R.id.car2_text)
        val car3 = findViewById<TextView>(R.id.car3_text)
        val carnumber = findViewById<EditText>(R.id.number)
        val carbrand = findViewById<EditText>(R.id.car)
        val carname = findViewById<EditText>(R.id.name)
        val okbutton = findViewById<Button>(R.id.ok)
        val cancelbutton = findViewById<Button>(R.id.cancel)
        number.visibility = View.VISIBLE
        carbrand.visibility = View.VISIBLE
        carname.visibility = View.VISIBLE
        okbutton.visibility = View.VISIBLE
        cancelbutton.visibility = View.VISIBLE
        if(view.id.equals(car1.id)){
            okbutton.setOnClickListener{
                updateCar(car1)
            }
            cancelbutton.setOnClickListener{
                delete(car1)
            }
        }else if(view.id.equals(car2.id)){
            okbutton.setOnClickListener{
                updateCar(car2)
            }
            cancelbutton.setOnClickListener{
                delete(car2)
            }
        }else{
            okbutton.setOnClickListener{
                updateCar(car3)
            }
            cancelbutton.setOnClickListener{
                delete(car3)
            }
        }
    }

    private fun updateCar(view: TextView){
        val carnumber = findViewById<EditText>(R.id.number)
        val carbrand = findViewById<EditText>(R.id.car)
        val carname = findViewById<EditText>(R.id.name)
        val okbutton = findViewById<Button>(R.id.ok)
        val cancelbutton = findViewById<Button>(R.id.cancel)

        car?.Number = carnumber.text.toString()
        car?.CarBrand = carbrand.text.toString()
        car?.Name = carname.text.toString()

        number.visibility = View.GONE
        carbrand.visibility = View.GONE
        carname.visibility = View.GONE
        okbutton.visibility = View.GONE
        cancelbutton.visibility = View.GONE
        view.setBackgroundColor(Color.RED)
        view.setText("${car.Number}")
    }

    private fun delete(view: TextView){
        val carnumber = findViewById<EditText>(R.id.number)
        var carbrand = findViewById<EditText>(R.id.car)
        var carname = findViewById<EditText>(R.id.name)
        val updatebutton = findViewById<Button>(R.id.ok)
        val deletebutton = findViewById<Button>(R.id.cancel)
        view.setBackgroundColor(Color.GREEN)
        carnumber.visibility = View.GONE
        carbrand.visibility = View.GONE
        carname.visibility = View.GONE
        updatebutton.visibility = View.GONE
        deletebutton.visibility = View.GONE
        view.text = "Empty"
    }
    private fun setListeners() {
        val carnumber = findViewById<EditText>(R.id.number)
        val carbrand = findViewById<EditText>(R.id.car)
        val carname = findViewById<EditText>(R.id.name)
        val okbutton = findViewById<Button>(R.id.ok)
        val cancelbutton = findViewById<Button>(R.id.cancel)

        carnumber.visibility = View.GONE
        carbrand.visibility = View.GONE
        carname.visibility = View.GONE
        okbutton.visibility = View.GONE
        cancelbutton.visibility = View.GONE
    }
}