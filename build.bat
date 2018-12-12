rmdir /S /Q %cd%\build
mkdir %cd%\build

cmd /c "C:\Program Files\Java\jdk1.8.0_162\bin\javac" -cp ./lib/gson-2.8.5.jar -d ./build ./src/*.java

cd %cd%\build

cmd /c "C:\Program Files\Java\jdk1.8.0_162\bin\jar" -cvfe NeoBrowser.jar *.class

cd ..



