name := "evercraft2"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.6.6" % "test",
  "com.wix" %% "specs2-jmock" % "0.1.17" % "test")

scalacOptions in Test ++= Seq("-Yrangepos")