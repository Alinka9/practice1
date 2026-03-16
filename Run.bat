@echo off
chcp 65001 > nul
cd target
java -jar practice-persons-1.1-jar-with-dependencies.jar
cd ..
pause