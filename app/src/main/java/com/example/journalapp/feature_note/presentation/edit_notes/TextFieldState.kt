package com.example.journalapp.feature_note.presentation.edit_notes

data class TextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)