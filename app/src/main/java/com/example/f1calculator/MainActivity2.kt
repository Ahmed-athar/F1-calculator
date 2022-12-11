package com.example.f1calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var test=intent.getIntExtra("choice",0)
        if (test==1) {
            garagecar.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.car1,null))
            res_layout.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.soft_tireres,null))
        }
        else if (test==2){
            garagecar.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.car2,null))
            res_layout.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.mediumtireres,null))
        }
        else if (test==3){
            garagecar.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.car3,null))
            res_layout.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.hardtireres,null))
        }
        else if (test==4){
            garagecar.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.car4,null))
            res_layout.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.intertireres,null))
        }
        else if (test==5){
            garagecar.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.car5,null))
            res_layout.setImageDrawable(ResourcesCompat.getDrawable(resources,R.drawable.wettireres,null))
        }
    }
    fun goBack(view: View){
        val intent = Intent(this@MainActivity2,MainActivity::class.java)
        var checker=1
        intent.putExtra("checker",checker)
        startActivity(intent)
    }
}