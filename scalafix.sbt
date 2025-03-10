ThisBuild / semanticdbEnabled := true

ThisBuild / semanticdbVersion := scalafixSemanticdb.revision

ThisBuild / scalafixDependencies ++= Seq("com.github.liancheng" %% "organize-imports" % "0.6.0")
