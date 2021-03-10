plugins {
    java
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"


application {
    mainClass.set("cn.yejy.hello.App")
}

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
}
