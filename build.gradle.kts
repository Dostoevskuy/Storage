// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.androidLibrary) apply false
    alias(libs.plugins.jetbrainsKotlinJvm) apply false
    alias(libs.plugins.hiltAndroid) apply false
    alias(libs.plugins.safeArgsKotlin) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.compose.compiller) apply false
    alias(libs.plugins.google.gms) apply false
}