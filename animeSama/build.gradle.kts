plugins {
    id("com.android.library")
    id("kotlin-android")
    id("com.github.recloudstream.cloudstream")
}

android {
    compileSdk = 30
    defaultConfig {
        minSdk = 21
        targetSdk = 30
    }
    buildFeatures {
        viewBinding = true
    }
}

cloudstream {
    // Les infos de ton extension
    description = "Anime-Sama par Vis2772"
    authors = listOf("Vis2772")
    status = 1
    tvTypes = listOf("Anime")
    requiresResources = true
    language = "fr"
    iconUrl = "https://cdn.statically.io/gh/Anime-Sama/IMG/img/autres/logo.png"
}

// Numéro de version (change le chiffre quand tu fais une mise à jour)
version = 4

dependencies {
    // Les outils nécessaires pour Cloudstream
    val cloudstream3Version = "pre-release"
    implementation("com.github.recloudstream.cloudstream:library:$cloudstream3Version")
    implementation("com.github.recloudstream.cloudstream:app:$cloudstream3Version")
    implementation("org.jsoup:jsoup:1.13.1")
    implementation(kotlin("stdlib"))
}