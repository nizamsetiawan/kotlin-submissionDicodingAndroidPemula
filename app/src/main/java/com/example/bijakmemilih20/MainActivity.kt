package com.example.bijakmemilih20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bijakmemilih20.adapter.Adapter
import com.example.bijakmemilih20.data.dataPartai
import com.example.bijakmemilih20.model.partai

class MainActivity : AppCompatActivity() {
    private val listPartai: ArrayList<partai> = arrayListOf()
    private lateinit var rvPartai : RecyclerView
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi custom toolbar
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        //font color
        toolbar.setTitleTextColor(resources.getColor(R.color.white))



        // Inisialisasi recycler view
        rvPartai = findViewById(R.id.recycle_partai)
        rvPartai.setHasFixedSize(true)
        listPartai.addAll(dataPartai.listDataPartai)
        tampilkanDataPartai()
    }

    private fun tampilkanDataPartai() {
        rvPartai.layoutManager = LinearLayoutManager(this)
        val adapterPartai = Adapter(listPartai)
        rvPartai.adapter = adapterPartai
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_profile -> {
                startActivity(Intent(this, ProfileActivity::class.java))
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
} }
