Gradle Plugin Template
=============================

A [Giter8](https://github.com/n8han/giter8/) template for Gradle plugin projects. Answer simple questions
and get a project structure with everything to publish your project to mavenCentral repository.

Requirements
============

* [Giter8](https://github.com/n8han/giter8#installation)

Usage
=======

```g8 marceloemanoel/gradle-plugin-template```

Properties Description
----------------------

`idePlugin:` The gradle IDE plugin used to develop the project. **Defaults to _eclipse_, accepts _idea_
             too**

`pluginDescription:` The description of your plugin. It will be used on the pom descriptor and your 
                     README file. **Defaults to _My first plugin_**

`name:` The name of your plugin. It will be used on the project descriptor, plugin class, friendly plugin 
        name and README file. **Defaults to _Plugin Name_**

`package:` The main package of your plugin. It will be used as your project group on pom descriptor, 
           README file, plugin class and friendly plugin name files. **Defaults to _com.github.username_**

`developerName:` That's your name! It will appear at your pom descriptor, License and README files. 
                **Defaults to _Developer Name_**

`githubUsername:` That's your GitHub username. Used inside of pom descriptor. It will be used to 
                 generate your project links and identify you. **Defaults to _developer_**

Contributions
=============

Fork and Pull Requests accepted! 