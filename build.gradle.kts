buildscript {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io") // Ajoute cette ligne
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.4")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath("com.github.recloudstream:gradle:master-SNAPSHOT") // Ajoute cette ligne
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}