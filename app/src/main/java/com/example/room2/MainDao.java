package com.example.room2;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import static androidx.room.OnConflictStrategy.REPLACE;

@Dao
public interface MainDao {

    // Insert Query..
    @Insert(onConflict = REPLACE)
    void Insert(MainData mainData);

    // Delete Query..
    @Delete
    void delete(MainData mainData);

    // Delete All Query..
    @Delete
    void reset( List<MainData> mainData);

    // Update Query..
    @Query("UPDATE table_name SET text = :sText WHERE ID = :sID")
    void update(int sID, String sText);

    // Get Query..
    @Query("SELECT * FROM table_name")
    List<MainData> getAll();
}
