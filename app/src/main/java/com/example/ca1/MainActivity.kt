package com.example.ca1

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listViewDrives = findViewById<ListView>(R.id.listViewDrives)
        val placementDrives = listOf(
            PlacementDrive("Google", "2024-09-15", "Software Engineer"),
            PlacementDrive("Microsoft", "2024-09-16", "Data Scientist"),
            PlacementDrive("Amazon", "2024-09-17", "Cloud Engineer")

        )
        val adapter = PlacementDriveAdapter(this, placementDrives)
        listViewDrives.adapter = adapter
    }
}
