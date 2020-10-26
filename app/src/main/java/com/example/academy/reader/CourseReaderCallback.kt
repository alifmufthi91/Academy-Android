package com.example.academy.reader

interface CourseReaderCallback {
    fun moveTo(position: Int, moduleId: String)
}