import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.2.5"
	id("io.spring.dependency-management") version "1.1.4"
	kotlin("jvm") version "1.9.23"
	kotlin("plugin.spring") version "1.9.23"
}

group = "rio"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_21
}

repositories {
	mavenCentral()
}

dependencies {

	implementation("org.springframework.boot:spring-boot-starter-web") {
		exclude(module = "spring-boot-starter-tomcat")
  	}
  	implementation("org.springframework.boot:spring-boot-starter-jetty")

	implementation("org.springframework.boot:spring-boot-starter-actuator:3.2.5")
	implementation("org.springframework.boot:spring-boot-starter-security:3.2.5")
	implementation("org.springframework.boot:spring-boot-starter-data-jdbc")


	//implementation("org.springframework.boot:spring-boot-starter-oauth2-authorization-server")
	//implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server")

	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("com.h2database:h2:2.2.224")
	
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
	
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "21"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
