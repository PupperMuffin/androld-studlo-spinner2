package com.example.spinner

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.RotateAnimation
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set the layout for the activity
        setContentView(R.layout.activity_main)

        // Find the ImageView in the layout by its ID
        val spinnerImage: ImageView = findViewById(R.id.spinnerImage)

        // Set an OnClickListener on the ImageView
        spinnerImage.setOnClickListener {
            // Create a RotateAnimation to rotate the image from 0 to 360 degrees
            val rotateAnimation = RotateAnimation(
                0f, 360f, // Start angle (0) and end angle (360)
                Animation.RELATIVE_TO_SELF, 0.5f, // Pivot X at the center (50% of width)
                Animation.RELATIVE_TO_SELF, 0.5f // Pivot Y at the center (50% of height)
            )

            // Set the duration of the animation to 1 second (1000 ms)
            rotateAnimation.duration = 1000
            // Ensure the image remains in its final position after the animation
            rotateAnimation.fillAfter = true
            // Start the animation on the ImageView
            spinnerImage.startAnimation(rotateAnimation)
        }
    }
}
