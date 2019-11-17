package com.example.finalexam07570531.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface QueryUser {

    @Query("SELECT * FROM user_from")
    List<UserItem> getAll();

    @Insert
    void insert(UserItem ledgerItem);
}