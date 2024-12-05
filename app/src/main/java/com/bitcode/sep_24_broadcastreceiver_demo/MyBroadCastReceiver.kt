package com.bitcode.sep_24_broadcastreceiver_demo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadCastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent != null) {
            if(intent.action.equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)){
                    Toast.makeText(context,"Airplane mode changed",Toast.LENGTH_LONG).show()
                    if (intent.getBooleanExtra("state", true)){
                        Toast.makeText(context,"Airplane mode changed",Toast.LENGTH_LONG).show()
                    }
                    else {
                        Toast.makeText(context,"Airplane mode not changed",Toast.LENGTH_LONG).show()
                    }
            }
        }

        if (intent!!.action.equals(Intent.ACTION_BATTERY_LOW)){
            if (intent.getBooleanExtra("state",true)){
                Toast.makeText(context,"Battery Low",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(context,"Battery OK",Toast.LENGTH_LONG).show()
            }
        }
    }
}