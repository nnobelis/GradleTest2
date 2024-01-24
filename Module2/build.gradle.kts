plugins {
    kotlin("jvm")
}

group = "org.example"
version = "1.0-SNAPSHOT"

dependencies {
    implementation("org.hibernate.orm:hibernate-core:6.3.1.Final")
}

kotlin {
    jvmToolchain(21)
}