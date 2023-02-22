package com.example.domain.repo

import com.example.domain.models.Task
import kotlinx.coroutines.flow.Flow

interface TaskRepository {
    fun getAllTasks() : Flow<List<Task>>
    suspend fun deleteAllTasks()
    suspend fun updateTask(task: Task)
    suspend fun insertTask(task: Task)
    suspend fun deleteTask(task: Task)
}