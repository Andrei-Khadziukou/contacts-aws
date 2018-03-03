# Contacts project

The application holds the list of users and is based on AWS.

# Project initialization
## Adding gradle support
You need just go into the root project folder and to put the command `gradle init`
Run `gradle wrapper --gradle-version <latest gradle version>` (Make sure you use gradlE) to say gradle wrapper to use specific version of the gradle.
For example, `gradle wrapper --gradle-version 4.6`

## Add .gitignore file to prevent unnecessary files to appear in commits
You just need to create .gitignore file, to add folders/files that you want to exclude.
List of exclusion:
- `/.gradle/` - the files from the .gradle folder that automatically generated by Gradle to perform operations
- `.gitignore` - the .gitignoe file. I prefer not sharing it because it can contain workstation specific files/folders (that are different on developers workstations)
- Idea plugin and Intelligent Idea IDE specific ignores
-- *.iml
-- *.ipr
-- *.iws
-- /.idea/

## Add Intelligent Idea Support
You just need to add the plugin into build script and run command in console `gradlew idea`
