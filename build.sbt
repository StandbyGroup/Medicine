name := """Medicine"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
    "mysql" % "mysql-connector-java" % "5.1.21",
    "com.typesafe.slick" %% "slick" % "2.1.0",
    "com.typesafe.slick" %% "slick-codegen" % "2.1.0-RC3",
    "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
//   jdbc,
//   anorm,
//   cache,
//   ws
)
