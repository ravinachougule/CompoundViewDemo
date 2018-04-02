package com.example.lenovo.compuondviewdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.compound_view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd.setOnClickListener(this::onClicked);
    }

    private fun onClicked(view :View){
        val vw : View = layoutInflater.inflate(R.layout.compound_view, lytRoot, true)

        vw.findViewById<ImageView>(R.id.imgVw1).setOnClickListener {
            txt1.textSize=20f
            txt2.textSize=15f
        }
        vw.findViewById<TextView>(R.id.txt1).setOnClickListener{
            txt1.setTextColor()
            txt2.textSize=15f
        }
    }
}
