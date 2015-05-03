name := "Virblog"

version := "1.0"

lazy val `virblog` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test,
  "com.typesafe.slick"  %% "slick"          % "3.0.0",
  "org.slf4j"            % "slf4j-nop"      % "1.7.10",
  "org.postgresql"       % "postgresql"     % "9.4-1201-jdbc41",
  "com.zaxxer"           % "HikariCP"       % "2.3.6",
  "com.github.tminglei" %% "slick-pg"       % "0.9.0-beta",
  "org.webjars"          % "bootstrap"      % "3.3.4",
  "org.webjars"          % "jquery"         % "2.1.3"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )