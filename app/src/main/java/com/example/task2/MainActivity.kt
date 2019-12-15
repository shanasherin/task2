
package com.example.task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
           val h= height.getText().toString().toInt()
            val w=weight.getText().toString().toInt()
            if(h ==0 || w ==0)
                {
                text.text="enter height and weight"
            }
            else
            {
                val bmi= (w/h*h)*10000.toDouble()
               text.text= bmi.toFloat().toString()

            }
        }
    }
}
