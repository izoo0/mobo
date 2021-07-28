package com.example.mcars

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class MainActivity : AppCompatActivity() {
    var sampleImages = intArrayOf(
        R.drawable.cars6,
        R.drawable.cars6,
        R.drawable.cars6,
        R.drawable.cars6,
        R.drawable.cars6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val carouselView = findViewById<CarouselView>(R.id.carouselView)
        carouselView.setPageCount(sampleImages.size)
        carouselView.setImageListener(imageListener)

    }

    var imageListener: ImageListener = object : ImageListener {
        override fun setImageForPosition(position: Int, imageView: ImageView) {
            // You can use Glide or Picasso here
            imageView.setImageResource(sampleImages[position])
        }
    }
}