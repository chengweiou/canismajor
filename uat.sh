./gradlew bootJar
cp build/libs/canismajor-0.0.1-SNAPSHOT.jar ~/Desktop/docker/universe/canismajor/ser.jar
#cp src/main/resources/application.yml ~/Desktop/docker/universe/canismajor/config/
cp src/main/resources/application-uat.yml ~/Desktop/docker/universe/canismajor/config/
cp src/main/resources/log4j2.xml ~/Desktop/docker/universe/canismajor/config/
cp docker-compose.yml ~/Desktop/docker/universe/canismajor/docker-compose.yml
cd ~/Desktop/docker/universe/canismajor

docker compose down
docker compose rm -f
docker compose up -d
