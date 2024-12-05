package com.bitcode.sep_24_broadcastreceiver_demo

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bitcode.sep_24_broadcastreceiver_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var myBroadCastReceiver : MyBroadCastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.btnRegisterBroadcast.setOnClickListener {
            Toast.makeText(this,"register",Toast.LENGTH_LONG).show()
            myBroadCastReceiver = MyBroadCastReceiver()
            val intentFilter = IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED)
            intentFilter.addAction(Intent.ACTION_BATTERY_LOW)
            registerReceiver(myBroadCastReceiver,intentFilter)
        }

        activityMainBinding.btnUnregisterBroadcast.setOnClickListener {
            Toast.makeText(this,"unregister Receiver",Toast.LENGTH_LONG).show()
            unregisterReceiver(myBroadCastReceiver)
        }
    }
}