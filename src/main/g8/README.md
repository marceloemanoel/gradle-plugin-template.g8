$name$
=============================

$pluginDescription$

Install
=======

Just put the following code snippet in your build.gradle file.

```groovy
buildScript {
  repositories {
    mavenCentral()
  }
  dependencies {
    classpath "$package$:$name;format="norm"$:0.1"
  }
}

apply plugin: "$name;format="norm"$"
```
