package com.example.journalapp

sealed class Screen(val route: String) {
    object NotesScreen: Screen("notes_screen")
    object EditNoteScreen: Screen("edit_note_screen")
}