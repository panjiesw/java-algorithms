plugins {
  java
}

group = "com.panjiesw"
version = "1.0.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  testRuntime("org.junit.platform:junit-platform-launcher:1.4.1")
  testRuntime("org.junit.jupiter:junit-jupiter-engine:5.4.1")
  testRuntime("org.junit.vintage:junit-vintage-engine:5.4.1")
  testImplementation("org.junit.jupiter:junit-jupiter:5.4.1")
  testImplementation("org.assertj:assertj-core:3.11.1")
}

configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<Test> {
  useJUnitPlatform()
  testLogging {
    events("passed", "skipped", "failed")
  }
}

