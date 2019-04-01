plugins {
  java
}

group = "com.panjiesw"
version = "1.0.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
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

