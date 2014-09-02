it.impossible.sbt.Common.settings

name := "impossible-util"

lazy val root = (project in file("."))
  .aggregate(random, common)

lazy val random = (project in file("util-random"))
  .dependsOn(common)

lazy val common = project in file("util-common")
