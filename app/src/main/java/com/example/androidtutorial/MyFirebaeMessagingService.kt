package com.example.androidtutorial

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

class MyFirebaeMessagingService : FirebaseMessagingService() {
    override fun onNewToken(token: String) {
        Log.d("thaomoc","token = "+ token);
    }
}