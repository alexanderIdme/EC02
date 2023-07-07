package com.example.evaluacion02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapaActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var map: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapa)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.mapFragment) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap

        // Agregar marcadores
        addMarker(LatLng(-12.003595286944169, -77.06071181803337), "av tomas valle", "lima")
        addMarker(LatLng(-11.988745520952062, -77.05947800191983), "av carlos izaguirre", "lima")
        addMarker(LatLng(-11.991180308908994, -77.05912395034474), "av industrial", "lima")

        // Establecer posición y nivel de zoom
        val initialPosition = LatLng(37.7749, -122.4194)
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(initialPosition, 10f))
    }

    private fun addMarker(position: LatLng, title: String, snippet: String) {
        map.addMarker(MarkerOptions().position(position).title(title).snippet(snippet))
    }
}