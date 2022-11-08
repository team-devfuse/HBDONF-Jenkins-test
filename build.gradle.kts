plugins {
    id("org.springframework.boot") version "2.2.6.RELEASE"
    id("io.spring.dependency-management") version "1.0.14.RELEASE"
    id ("java")
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
}
group = "com.devfuse.jenkins"
version = "0.0.1-SNAPSHOT"
description = "HBDONF-Jekins-test"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
}

dependencyManagement {
    imports {
        mavenBom ("org.springframework.cloud:spring-cloud-dependencies:Hoxton.SR12")
    }
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation ("org.springframework.boot:spring-boot-starter")
    implementation ("org.springframework.boot:spring-boot-starter-web")

    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//    runtimeOnly ("org.mariadb:r2dbc-mariadb")

    implementation("io.netty:netty-resolver-dns-native-macos:4.1.68.Final:osx-aarch_64")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}


