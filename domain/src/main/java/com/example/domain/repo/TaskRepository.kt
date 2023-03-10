package com.example.domain.repo

import com.example.domain.models.Task
import kotlinx.coroutines.flow.Flow

interface TaskRepository {
    fun getAllTasks(listType : String) : Flow<List<Task>>

    suspend fun deleteListTasks(listType : String)
    fun countCompleted(listType: String) : Int
    suspend fun deleteAllTasks()
    suspend fun updateTask(task: Task)
    suspend fun insertTask(task: Task)
    suspend fun deleteTask(task: Task)
}