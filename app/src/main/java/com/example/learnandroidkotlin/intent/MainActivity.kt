package com.example.learnandroidkotlin.intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.learnandroidkotlin.R

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        val btnMoveActiviy: Button = findViewById(R.id.btn_move_activity)
        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        val btnDialPhoneActiviy: Button = findViewById(R.id.btn_dial_number)
        btnMoveActiviy.setOnClickListener(this)
        btnMoveWithDataActivity.setOnClickListener(this)
        btnDialPhoneActiviy.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_activity_data -> {
                val moveIntentWithData = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveIntentWithData.putExtra(MoveWithDataActivity.EXTRA_NAME, "Dicoding Academy Participant")
                moveIntentWithData.putExtra(MoveWithDataActivity.EXTRA_AGE, 5)
                startActivity(moveIntentWithData)
            }
            R.id.btn_dial_number -> {
                val phoneNumber = "085721312334"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))// tel: >> uri schema android phone
                startActivity(dialPhoneIntent)
            }
        }
    }
}
