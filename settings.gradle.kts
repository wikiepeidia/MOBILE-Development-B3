/*
 * Copyright (c) 2025 Pham The Minh
 * All rights reserved.
 * Project: USTH Weather
 * File: settings.gradle.kts
 * Last Modified: 15/9/2025 10:15
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
 