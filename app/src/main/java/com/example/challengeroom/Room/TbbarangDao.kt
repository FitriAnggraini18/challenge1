package com.example.challengeroom.Room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TbbarangDao (
    @PrimaryKey()
        val id:Int,
        val Nama_brg:String,
         val harga  :String,
         val QTY:String,

)