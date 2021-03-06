package com.example.basicapplicationfunction.Temp;

import androidx.lifecycle.LiveData;

import java.util.List;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface AlarmDao {
    @Insert
    void insert(Alarm alarm);

    @Query("DELETE FROM alarm_table")
    void deleteAll();

    @Query("SELECT * FROM alarm_table ORDER BY alarmId ASC")
    LiveData<List<Alarm>> getAlarms();

    @Delete
    void delete(Alarm alarm);

    @Update
    void update(Alarm alarm);
}