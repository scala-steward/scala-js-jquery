import sbt._
import sbt.Keys._

scalaVersion := "2.13.12"
crossScalaVersions := Seq(
  "3.0.2",
  "2.13.7",
  "2.12.15",
  "2.11.12"
)

lazy val root = project.in(file("."))
  .settings(name := "scalajs-jquery")
  .aggregate(jquery3, jquery3Compat)
  .settings(MySettings.commonSettings)
  .settings(MySettings.publishingSettings)
  .settings(MySettings.nonPublishingSetting)
  .settings(libraryDependencies := Seq.empty)

lazy val jquery3 = project.in(file("jquery3"))
  .enablePlugins(ScalaJSPlugin)
  .settings(MySettings.commonSettings)
  .settings(MySettings.publishingSettings)
  .settings(
    name := "scalajs-jquery3"
  )

lazy val jquery3Compat = project.in(file("jquery3-compat"))
  .enablePlugins(ScalaJSPlugin)
  .settings(MySettings.commonSettings)
  .settings(MySettings.publishingSettings)
  .settings(
    name := "scalajs-jquery3-compat"
  )
  .dependsOn(jquery3)
