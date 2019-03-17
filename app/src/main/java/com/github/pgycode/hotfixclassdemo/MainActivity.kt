package com.github.pgycode.hotfixclassdemo

import android.Manifest
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), 2)
        };

        findViewById<Button>(R.id.btn).setOnClickListener {
            Toast.makeText(this, FixTest.getNum().toString(), Toast.LENGTH_SHORT).show()
        }
    }
}
