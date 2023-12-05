plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.rest-assured:rest-assured:5.3.0")
    testImplementation("com.codeborne:selenide:7.0.2")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.0")

}

tasks.test {
    useJUnitPlatform()
}