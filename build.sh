#!/bin/sh
rm -r ./build
mkdir -m777 ./build
javac -cp ./lib/gson-2.8.5.jar -d ./build ./src/*.java
cd ./build
jar -cvfe NeoBrowser.jar *.class
cd ..