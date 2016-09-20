import sbt.Keys._
import sbt._

name := "travis-ci"

version := "1.0"

scalaVersion := "2.11.8"


lazy val root = (project in file("."))
  .enablePlugins(DockerComposePlugin, JavaServerAppPackaging, DockerPlugin, BuildInfoPlugin, GitVersioning)
  .settings(DockerCompose.settings: _*)
  .settings(Resolve.settings: _*)

scalacOptions += "-feature"

// Healthchecks
libraryDependencies += "com.timeout" %% "akka-http-healthchecks" % "1.1.0"
    