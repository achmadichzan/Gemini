package com.achmadichzan.gemini

import android.graphics.Bitmap
import com.achmadichzan.gemini.data.Chat

data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)