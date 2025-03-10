ThisBuild / resolvers += "Artima Maven Repository".at("https://repo.artima.com/releases")

addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.12")

addSbtPlugin("org.typelevel" % "sbt-tpolecat" % "0.5.2")

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.14.2")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.4")

addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.9.2")
