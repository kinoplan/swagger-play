resolvers in ThisBuild += "Artima Maven Repository".at("https://repo.artima.com/releases")

addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.12")

addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.4.1")

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.26")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.2")

addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.10")
