package com.example.challengeroom

import androidx.room.*

class barangDao {
    @Dao
    interface TbbarangDao{
        @Insert
        fun addTbbarang(tbbarang:tbbarang)
        @Update
        fun updateTbbarang(tbbarang:tbbarang)
        @Delete
        fun deleteTbbarang(tbbarang:tbbarang)
        @Query("SELECT*FROM Tbbarang)
        fun getTbbarang():list<Tbbarang>
    }
}