$name$
=============================

$description$

Install
=======

Just put the following code snippet in your build.gradle file.

```groovy
buildScript {
  repositories {
    mavenCentral()
  }
  dependencies {
    classpath "$group$:$name;format="norm"$:0.1"
  }
}

apply plugin: "$name;format="norm"$"
```