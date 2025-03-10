ThisBuild / resolvers += "Artima Maven Repository".at("https://repo.artima.com/releases")

val playVersion = "3.0.6"
val swaggerVersion = "2.2.28"

lazy val root = project.in(file(".")).enablePlugins(ScalafixPlugin).settings(name := "swagger-play")
  .settings(
    scalaVersion := "2.13.16",
    scalacOptions ~=
      (_.filterNot(Set(
        "-Wdead-code",
        "-Wunused:params",
        "-Ywarn-dead-code",
        "-Ywarn-unused:params",
        "-Ywarn-unused:patvars",
        "-Wunused:explicits"
      )))
  ).settings(
    libraryDependencies ++= Seq(
      "com.github.pureconfig"        %% "pureconfig"              % "0.17.8",
      "org.playframework"            %% "play"                    % playVersion,
      "org.playframework"            %% "play-routes-compiler"    % playVersion,
      "org.scala-lang.modules"       %% "scala-collection-compat" % "2.13.0",
      "io.swagger.core.v3"            % "swagger-core"            % swaggerVersion,
      "io.swagger.core.v3"            % "swagger-annotations"     % swaggerVersion,
      "io.swagger.core.v3"            % "swagger-models"          % swaggerVersion,
      "io.swagger.core.v3"            % "swagger-jaxrs2"          % swaggerVersion,
      "com.github.swagger-akka-http" %% "swagger-scala-module"    % "2.13.0",
      "javax.ws.rs"                   % "javax.ws.rs-api"         % "2.1.1"
    )
  )

inThisBuild(List(
  sonatypeCredentialHost := Sonatype.sonatype01,
  versionScheme := Some(VersionScheme.EarlySemVer),
  organization := "io.kinoplan",
  homepage := Some(url("https://github.com/kinoplan/swagger-play")),
  licenses := Seq("Apache-2.0" -> url("https://opensource.org/licenses/Apache-2.0")),
  developers :=
    List(Developer("kinoplan", "Kinoplan", "job@kinoplan.ru", url("https://kinoplan.tech"))),
  scmInfo := Some(ScmInfo(
    url("https://github.com/kinoplan/swagger-play"),
    "scm:git:git@github.com:kinoplan/swagger-play.git"
  ))
))
