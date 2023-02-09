package com.example.challengeroom

import androidx.appcompat.app.AppCompatActivity
import com.example.challengeroom.Room.dbbarang
import kotlinx.android.synthetic.main.activity_edit.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class EditActivity : AppCompatActivity() {
    val db lazy {dbbarang(this)
        fun simpan data () }
    btnsave.Setonlicklistener{
        coroutineScope {Dispatchers.IO ).lauch{
            db.tbbarangDao().addTbbarang(
                tbbarang(  ET id .text.tostring().to int(),
                          ET.nama.text.tostring().to int()
                          ET.harga.text.tostring() .to int()
                           ET.QTY.text.tostring().to int()
                    finish()
        }

        }
    }




