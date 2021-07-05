/*
 * Copyright 2020 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

enableFeaturePreview("VERSION_CATALOGS")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()

        jcenter {
            content {
                includeGroup("org.jetbrains.kotlinx")
                includeGroup("com.github.aakira")
            }
        }
    }
}

includeBuild("crash-reporting-build-logic")


include(":crash-reporting-core")
include(":crash-reporting-crashlytics")
include(":crash-reporting-napier")
include(":sample:android-app")
include(":sample:mpp-library")