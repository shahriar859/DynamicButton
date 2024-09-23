package com.shahriar.task9

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnFree = findViewById<Button>(R.id.btn_free)
        val btnFixed = findViewById<Button>(R.id.btn_fixed)
        val btnBidding = findViewById<Button>(R.id.btn_bidding)

        val etFixedPrice = findViewById<EditText>(R.id.et_fixed_price)
        val etBiddingPrice = findViewById<EditText>(R.id.et_bidding_price)

        val cbAcceptTerms = findViewById<CheckBox>(R.id.cb_accept_terms)

        btnFree.backgroundTintList = null
        btnFixed.backgroundTintList = null
        btnBidding.backgroundTintList = null


        fun resetButtons() {

            btnFree.setBackgroundResource(R.drawable.btn_left)
            btnFixed.setBackgroundResource(R.drawable.btn_mid)
            btnBidding.setBackgroundResource(R.drawable.btn_right)

            etFixedPrice.visibility = EditText.GONE
            etBiddingPrice.visibility = EditText.GONE
        }

        btnFree.setOnClickListener {
            resetButtons()
            btnFree.setBackgroundResource(R.drawable.selected_left)
            cbAcceptTerms.isChecked = false
        }

        btnFixed.setOnClickListener {
            resetButtons()
            btnFixed.setBackgroundResource(R.drawable.seleted_mid)
            etFixedPrice.visibility = EditText.VISIBLE
            cbAcceptTerms.isChecked = false
        }

        btnBidding.setOnClickListener {
            resetButtons()
            btnBidding.setBackgroundResource(R.drawable.seleted_right)
            etBiddingPrice.visibility = EditText.VISIBLE
            cbAcceptTerms.isChecked = false
        }
    }
}
