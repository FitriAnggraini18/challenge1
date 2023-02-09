    package com.example.challengeroom.Room

        import android.content.Context
        import androidx.room.Database
        import androidx.room.Room
        import androidx.room.RoomDatabase
        import java.lang.reflect.Type

        @Database(entities =[TbbarangDao::class], version = 1)
        abstract class dbbarang:RoomDatabase(){
            abstract class dbbarangDao():TbbarangDao
            companion object{
                @Volatile Private var instance:dbbarang?=null
                private val Lock=Any()
                operator fun invoke(context: Context)= instance?:
                synchronized(lock){
                    instance?:buildDatabase(context).also{
                        instance= it

                    }
                    }
                private fun buildDatabase(context: Context)=Room.databaseBuilder(
                    Context.application context
                            dbbarang::class.java,
                             "barang.db"
                ) .build()

            }

                }
