@echo off
@chcp 1250
echo enter number(double)
if not exist bin mkdir bin
javac -d bin -cp bin src/Main/Sinus.java
java -cp bin Main.Sinus   
set /p key=Enter key: