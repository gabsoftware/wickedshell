wickedshell
===========

Forked from: https://github.com/stefanreichert/wickedshell
Version 2.0.7

#Target environment
Eclipse 3.7 (Indigo)

#Modifications
- Added support for Windows 8, 8.1 and 10

#Building
- Clone this repository
- Download and unzip Eclipse Classic 3.7.2 (indigo) 32 bits
- Download and install a copy of J2SE-1.5 (Java 2 Platform, Standard Edition 5.0)
- Launch eclipse.exe
- Create a workspace
- Import all the project in the repository into your workspace
- Window > Preferences > Installed JREs : click Add and select your J2SE-1.5 home directory
- It should build automatically
- Select all the projects and choose Export > Plug-in Development > Deployable plug-ins and fragments
- Click Next
- Select All
- Choose a directory
- Click Finish

#Installation
- Compile from source as specified in the Building section, or use build/plugins/*.jar
- Copy JAR files into your eclipse directory/dropins/ directory
- Restart Eclipse 3.7
- If everything went find, Wicked Shell should appear under "Window > Preferences" settings window.