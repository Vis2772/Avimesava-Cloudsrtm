pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven("https://jitpack.io")
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "com.github.recloudstream.cloudstream") {
                useModule("com.github.recloudstream:gradle:master-SNAPSHOT")
            }
        }
    }
}

rootProject.name = "AnimeSama-Cloudstream"
include(":AnimeSama")