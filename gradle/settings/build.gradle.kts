plugins {
  `kotlin-dsl`
}

group = "buildLogic"

tasks.withType(JavaCompile::class).configureEach {
  sourceCompatibility = "21"
  targetCompatibility = "21"
}

tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class).configureEach {
  kotlinOptions {
    jvmTarget = "21"
  }
}