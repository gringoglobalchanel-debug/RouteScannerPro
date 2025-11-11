#!/bin/bash
echo "📦 Descargando Gradle..."
wget -q https://github.com/gradle/gradle/archive/refs/tags/v7.5.zip
unzip -q -o v7.5.zip -d gradle-temp
mv gradle-temp/gradle-7.5 gradle
rm -rf gradle-temp v7.5.zip

echo "🔨 Compilando con Gradle..."
./gradle/bin/gradle assembleDebug
