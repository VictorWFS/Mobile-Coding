buildscript {
    val agp_version by extra("8.7.0")
    val agp_version1 by extra("8.7.0")
    val agp_version2 by extra("8.7.2")
    val agp_version3 by extra("8.7.0")
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.7.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
}