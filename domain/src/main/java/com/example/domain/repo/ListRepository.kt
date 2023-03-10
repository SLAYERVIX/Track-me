package com.example.domain.repo

import com.example.domain.models.Task
import com.example.domain.models.TaskList
import kotlinx.coroutines.flow.Flow

interface ListRepository {
    fun getAllLists(): Flow<List<TaskList>>
    suspend fun deleteAllLists()
    suspend fun updateList(taskList: TaskList)
    suspend fun insertList(taskList: TaskList)
    suspend fun deleteList(taskList: TaskList)
}