package com.example.app_py_integrador_friendss.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.app_py_integrador_friendss.models.Person

@Dao
interface PersonDao {
    @Insert
    fun insertOne(person: Person)

    @Query("SELECT * FROM person")
    fun getAll(): List<Person>

    @Delete
    fun delete(person: Person)
}