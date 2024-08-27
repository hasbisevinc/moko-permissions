/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

plugins {
    id("dev.icerock.moko.gradle.multiplatform.mobile")
    id("dev.icerock.moko.gradle.publication")
    id("dev.icerock.moko.gradle.stub.javadoc")
    id("dev.icerock.moko.gradle.detekt")
    id("org.jetbrains.compose")
}

android {
    namespace = "dev.icerock.moko.permissions.compose"

    defaultConfig {
        minSdk = 21
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
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
