package com.kg.marat_uulu_daniyar_5of3month

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kg.marat_uulu_daniyar_5of3month.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.container_fragment, CounterFragment()).commit()
        }
    }
}