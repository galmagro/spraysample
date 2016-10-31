organization 	:= "com.garsol"

name          := "spraysample"

version 		  := "0.1"

scalaVersion	:= "2.11.8"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaVersion = "2.3.9"
  val sprayVersion = "1.3.4"
  Seq(
    "io.spray"            %%  "spray-can"     % sprayVersion withSources() withJavadoc(),
    "io.spray"            %%  "spray-routing" % sprayVersion withSources() withJavadoc(),
    "io.spray"            %%  "spray-json"    % "1.3.2",
    "io.spray"            %%  "spray-testkit" % sprayVersion  % "test",
    "com.typesafe.akka"   %%  "akka-actor"    % akkaVersion,
    "com.typesafe.akka"   %%  "akka-testkit"  % akkaVersion   % "test",
    "org.specs2"          %%  "specs2-core"   % "2.3.11" % "test",
    "org.scalaz"          %%  "scalaz-core"   % "7.1.0"
  )
}