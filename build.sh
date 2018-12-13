#!/bin/sh

#correct me before execution
export PATH="/c/Program Files/Java/jdk1.8.0_162/bin"

/bin/rm -r ./build
/bin/mkdir -p build
javac -cp ./lib/gson-2.8.5.jar -d ./build ./src/*.java
cd ./build
jar -cvfe NeoBrowser.jar *.class
cd ..