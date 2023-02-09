package com.example.challengeroom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.challengeroom.Room.dbbarang
import kotlinx.android.synthetic.main.activity_edit.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    val db by lazy {db barang }
    lateinit var

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        halEdit()
        (
    }

              override fun onStart() {
                super.onStart()
                CoroutineScope(Dispatchers.IO).launch {
                    val buku = db.().getTbbarang()
                    Log.d("MainActivity","dbResponse:$")
                }
            }

            private fun halEdit() {
                btnInput.setOnClickListener {
                    startActivity(Intent(this, EditActivity::class.java))

            fun simpan data (){
            btnSave.setOnClickListener {
                coroutineScope(Dispatchers.IO).launch {
                    db.tbbarangDao().addTbbarang(
                        dbbarang(
                            ET.Id text . tostring ().to int (),
                            ET.nama_brng.tostring().to int (),
                            ET.harga.tostring().to int ().to int (),


                        )
                    )
                    finish()
                    
                }
            }






