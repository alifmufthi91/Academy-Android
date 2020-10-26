package com.example.academy.bookmark

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.academy.data.source.local.entity.CourseEntity
import com.example.academy.data.source.AcademyRepository

class BookmarkViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getBookmarks(): LiveData<List<CourseEntity>> = academyRepository.getBookmarkedCourses()
}