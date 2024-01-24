rootProject.name = "GradleTest2"

pluginManagement {
    includeBuild("gradle/settings")
}

plugins {
    id("my-plugin")
}

include(":Module2")
project(":Module2").projectDir = file("./Module2")


