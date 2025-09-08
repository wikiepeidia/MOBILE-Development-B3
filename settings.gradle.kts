/*
 * Copyright (c) 2025
 * All rights reserved.
 * Project: USTH Weather
 * File: settings.gradle.kts
 * Created: 8/9/2025 10:33
 * Last Modified: 8/9/2025 10:33
 */

pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "USTH Weather"
include(":app")
 