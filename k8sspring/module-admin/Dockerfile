FROM openjdk:11
WORKDIR /usr/src
ARG JAR_FILE=build/libs/module-admin.jar
COPY ${JAR_FILE} ./module-admin.jar
ENV TZ=Asia/Seoul
ENV SPRING_PROFILE="dev"
ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILE}", "-jar", "./module-admin.jar"]
EXPOSE 8084