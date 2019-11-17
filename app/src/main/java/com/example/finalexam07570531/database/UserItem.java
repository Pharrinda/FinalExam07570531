package com.example.finalexam07570531.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

public class UserItem {
    public UserItem(int i, String ทดสอบ, int i1) {

    }

    @Entity(tableName = "user_from")
    public class User {

        @PrimaryKey(autoGenerate = true)
        public int id;

        @ColumnInfo(name = "username")
        public String Username;

        @ColumnInfo(name = "password")
        public String Password;

        public User(int id, String username, String password) {
            this.id = id;
            this.Username = username;
            this.Password = password;
        }
    }
}
