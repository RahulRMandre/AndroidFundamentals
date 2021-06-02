package com.example.androidfundamentals


import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private val TAG = MainActivity::class.java.simpleName
    private var count=0
    private lateinit var mShowCount:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"HelloWorld")

        mShowCount =  findViewById(R.id.show_count)

    }

    fun showToast(view: View) {
        val toast: Toast = Toast.makeText(
            this, R.string.toast_message,
            Toast.LENGTH_SHORT
        )
        toast.show()

    }
    fun countUp(view: View) {
        count++
        mShowCount.text=count.toString()
    }
}