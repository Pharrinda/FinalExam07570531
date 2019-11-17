package com.example.finalexam07570531.database;


import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.Executors;

import javax.security.auth.callback.Callback;

@Database(entities = {UserItem.class}, exportSchema = false, version = 1)
public abstract class AppDatabase {
//    private static final String DB_NAME = "user.db";
//
//    public abstract QueryUser userFrom();
//    private static AppDatabase mInstance;
//
//    public static synchronized AppDatabase getInstance(final Context context) {
//        if (mInstance == null) {
//            mInstance = Room.databaseBuilder(
//                        context.getApplicationContext(),
//                        AppDatabase.class,
//                        DB_NAME
//            ).addCallback(new Callback() {
//                @Override
//                public void onCreate(@NonNull SupportSQLiteDatabase db) {
//                    super.onCreate(db);
//
//                    Executors.newSingleThreadScheduledExecutor().execute(new Runnable() {
//                        @Override
//                        public void run() {
//                            mInstance.userFrom().insert(
//                                    new UserItem(
//                                            0, "ทดสอบ", 123456
//                                    )
//                            );
//                        }
//                    });
//                }
//                @Override
//                public void onOpen(@NonNull SupportSQLiteDatabase db) {
//                    super.onOpen(db);
//                }
//            }).build();
//        }
//        return mInstance;
//    }

}
