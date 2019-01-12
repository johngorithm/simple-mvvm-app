package com.jxw.mvvmapp.data;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    // constructor
    public Word(@NonNull String word) {
        this.mWord = word;
    }

    // getter method
    public String getWord() {
        return this.mWord;
    }

    // getter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWord(@NonNull String word) {
        this.mWord = word;
    }
}
