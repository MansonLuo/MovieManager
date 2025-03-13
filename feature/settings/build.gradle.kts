plugins {
    alias(libs.plugins.moviemanager.android.feature)
    alias(libs.plugins.moviemanager.android.library.compose)
}

android {
    namespace = "com.example.moviemanager.feature.settings"
}
