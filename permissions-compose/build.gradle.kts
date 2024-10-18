/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    id("dev.icerock.moko.gradle.multiplatform.mobile")
    id("org.jetbrains.compose")
}

android {
    namespace = "dev.icerock.moko.permissions.compose"

    defaultConfig {
        minSdk = 21
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "11"
            }
        }
    }
}

dependencies {
    commonMainApi(projects.permissions)
    commonMainApi(compose.runtime)
    androidMainImplementation(libs.activity)
    androidMainImplementation(libs.composeUi)
    androidMainImplementation(libs.lifecycleRuntime)
}
