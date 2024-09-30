package com.example.app_py_integrador_friendss.models

import androidx.room.ColumnInfo
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.PrimaryKey
import androidx.room.Query


@Entity
data class Person (
    @PrimaryKey
    val id: Int? = null,

    @ColumnInfo(name = "first_name")
    val firstName: String?,

    @ColumnInfo(name = "last_name")
    val lastName: String?,

    @ColumnInfo(name = "email")
    val email: String?,

    @ColumnInfo(name = "cell")
    val cell: String?,

    @ColumnInfo(name = "picture")
    val picture: String?,
)