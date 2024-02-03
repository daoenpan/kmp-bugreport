package com.consideo.myapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform