package com.example.ca1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class PlacementDriveAdapter(context: Context, private val drives: List<PlacementDrive>) :
    ArrayAdapter<PlacementDrive>(context, 0, drives) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?:
        LayoutInflater.from(context)
            .inflate(R.layout.placement_drive_item, parent, false)
        val drive = drives[position]
        val companyNameTextView =
            view.findViewById<TextView>(R.id.tvCompanyName)
        val dateTextView = view.findViewById<TextView>(R.id.tvDate)
        val positionTextView = view.findViewById<TextView>(R.id.tvPosition)
        val registerButton = view.findViewById<Button>(R.id.btnRegister)
        companyNameTextView.text = drive.companyName
        dateTextView.text = drive.date
        positionTextView.text = drive.position

        registerButton.setOnClickListener {
            Toast.makeText(context, "Registered for ${drive.companyName}", Toast.LENGTH_SHORT)
                .show()
        }
        return view
    }}

