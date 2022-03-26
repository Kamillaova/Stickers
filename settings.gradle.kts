pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }

    plugins {
        val agpVersion = "7.1.2"
        val safeArgsVersion = "2.4.1"
        val kotlinVersion = "1.6.10"

        kotlin("jvm") version kotlinVersion
        kotlin("android") version kotlinVersion
        kotlin("plugin.serialization") version kotlinVersion

        id("com.android.library") version agpVersion
        id("com.android.application") version agpVersion
        id("androidx.navigation.safeargs.kotlin") version safeArgsVersion
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }

    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
}

rootProject.name = "Stickers"

arrayOf(
    "android",
    "api",
    "desktop",
    "shared"
).forEach { include(":$it") }
