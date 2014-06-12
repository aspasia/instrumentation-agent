#!/bin/sh
cp bin/aspasia/util/MyAgent.class aspasia/util/MyAgent.class
cp bin/aspasia/util/Main.class aspasia/util/Main.class
jar -cmf manifest.txt agent.jar aspasia/util/MyAgent.class
java -javaagent:agent.jar -cp . aspasia.util.Main
