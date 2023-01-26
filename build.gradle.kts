// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id (Plugins.AGP.application) version Versions.AGP apply false
    id (Plagins.AGP.library) version Versions.AGP apply false
    id (Plagins.Kotlin.android) version Versions.kotlin apply false
    id (Plagins.Kotlin.jvn) version Versions.kotlin apply false
    id (Plagins.DaggerHilt.hilt) version Versions.kotlin apply false
}