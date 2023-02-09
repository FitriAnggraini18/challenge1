package com.example.challengeroom

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.challengeroom.Room.TbbarangDao


@Database(entities =[TbbarangDao::class], version = 1)
abstract class dbbarang: RoomDatabase(){
    abstract class dbbarangDao(): TbbarangDao
    companion object{
        @Volatile Private var instance:dbbarang?=null
        private val Lock=Any()
        operator fun invoke(context: Context): dbbarang {
            val lock
            return instance?: synchronized(lock){
                instance?:buildDatabase(context).also{
                    instance= It

                }
            }
        }
        private fun buildDatabase(context: Context)=RoomDatabase Builder(
                context.applicationContext,
                 dbbarang::class.java,
        "barang.db"
        ).build()

        }