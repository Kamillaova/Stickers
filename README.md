# kotlin-gradle-multi-module

I took this [video](https://youtu.be/5ZYOyo8ciBo) as a guideline.

Parent module: gradle-multi-module
Child modules:
- first-module (in which there is a dependency to second-module)
- second-module

```
❯ tree gradle-multi-module -I test -I gradle

gradle-multi-module
├── README.md
├── build.gradle.kts
├── first-module
│   ├── build.gradle.kts
│   └── src
│       └── main
│           ├── java
│           ├── kotlin
│           │   └── Sample.kt
│           └── resources
├── gradle.properties
├── gradlew
├── gradlew.bat
├── second-module
│   ├── build.gradle.kts
│   └── src
│       └── main
│           ├── java
│           ├── kotlin
│           │   └── MathOperation.kt
│           └── resources
├── settings.gradle.kts
└── src
    └── main
        ├── java
        ├── kotlin
        └── resources
```