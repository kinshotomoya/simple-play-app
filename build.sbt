name := """play-java-seed"""
organization := "tomoya"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  guice,
  javaJdbc,
  javaWs,
  "mysql" % "mysql-connector-java" % "5.1.21"
)
