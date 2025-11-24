plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    compileSdk = 30

    defaultConfig {
        minSdk = 21
        targetSdk = 30
    }

    sourceSets["main"].java.srcDir("src")
}

repositories {
    mavenCentral()
    maven { url = uri("https://maven.aliucord.com") }
}

dependencies {
    compileOnly("com.aliucord:api:1.0.0")
}
