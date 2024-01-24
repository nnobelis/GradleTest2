rootProject.name = "GradleTest2"

pluginManagement {
    includeBuild("gradle/settings")
}

plugins {
    id("my-plugin.settings.librairies")
    id("my-plugin.settings.repositories")
}

include(":Module2")
project(":Module2").projectDir = file("./Module2")


