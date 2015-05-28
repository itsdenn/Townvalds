# Townvalds
An opensource town plugin for Minecraft/Bukkit/Spigot

## How to start helping with this project
I assume you have already forked the project and setup Eclipse with Maven. If not, there are plenty of guides available on the internet.

#### Clone the project with the correct generated Maven files
So to clone the current project, right click in the "Package explorer" or "Project explorer" pane, and choose for "New -> Import -> Maven -> Check out Maven Projects from SCM".
In the URL field, enter your forked repo url. If everything is correct it should enable the finish button. Click it.
It'll now clone your forked repo to the current workspace.

#### Add the Spigot jar to the build path
Since there were copyright issues, you're now required to build Spigot yourself. Get the latest Spigot BuildTools from [here](https://hub.spigotmc.org/jenkins/job/BuildTools/). Run it with the following command:

```java -jar BuildTools.jar --rev 1.8.6```

It will download and compile Spigot for you. Now in Eclipse, right click on the just cloned project, and click on "properties". Select "Java Build Path" from the left pane. Click on "Add external JARs...". Now select the just compiled Spigot jar. Click ok and you're done!

## Useful guide(s)
[Create a basic Bukkit plugin](http://wiki.bukkit.org/Plugin_Tutorial#onEnable.28.29_and_onDisable.28.29)
