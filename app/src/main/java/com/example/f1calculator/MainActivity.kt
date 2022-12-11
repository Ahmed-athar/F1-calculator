package com.example.f1calculator

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        popup.setOnClickListener {
            popup.visibility = View.INVISIBLE
        }
        var checker = intent.getIntExtra("checker", 0)
        if (checker == 1) {
            popup.visibility = View.INVISIBLE
        }

        var choice = 0
        soft_btn.setOnClickListener {
            choice = 1
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("choice", choice)
            BgMusic = MediaPlayer.create(this, R.raw.f1_wheelgun)
            BgMusic?.setOnPreparedListener {
                BgMusic?.start()
            }
            startActivity(intent)
        }
        medium_btn.setOnClickListener {
            choice = 2
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("choice", choice)
            BgMusic = MediaPlayer.create(this, R.raw.f1_wheelgun)
            BgMusic?.setOnPreparedListener {
                BgMusic?.start()
            }
            startActivity(intent)
        }
        hard_btn.setOnClickListener {
            choice = 3
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("choice", choice)
            BgMusic = MediaPlayer.create(this, R.raw.f1_wheelgun)
            BgMusic?.setOnPreparedListener {
                BgMusic?.start()
            }
            startActivity(intent)
        }
        inter_btn.setOnClickListener {
            choice = 4
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("choice", choice)
            BgMusic = MediaPlayer.create(this, R.raw.f1_wheelgun)
            BgMusic?.setOnPreparedListener {
                BgMusic?.start()
            }
            startActivity(intent)
        }
        wet_btn.setOnClickListener {
            choice = 5
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("choice", choice)
            BgMusic = MediaPlayer.create(this, R.raw.f1_wheelgun)
            BgMusic?.setOnPreparedListener {
                BgMusic?.start()
            }
            startActivity(intent)
        }
    }
     private var BgMusic: MediaPlayer? = null
    }
