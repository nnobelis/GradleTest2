plugins {
    kotlin("jvm")
}

group = "org.example"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(libraries.hibernateCore)
}

kotlin {
    jvmToolchain(21)
}